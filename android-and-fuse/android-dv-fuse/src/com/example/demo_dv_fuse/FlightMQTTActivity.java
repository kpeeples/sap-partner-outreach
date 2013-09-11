package com.example.demo_dv_fuse;


import java.io.StringReader;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/*import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.fusesource.mqtt.client.Callback;
import org.fusesource.mqtt.client.CallbackConnection;
import org.fusesource.mqtt.client.FutureConnection;
import org.fusesource.mqtt.client.MQTT;
import org.fusesource.mqtt.client.Message;
import org.fusesource.mqtt.client.QoS;
import org.fusesource.mqtt.client.Topic;*/
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.example.demo_dv_fuse.DatePickerFragment;
import com.example.demo_dv_fuse.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.DatePicker;
import android.widget.CalendarView;

public class FlightMQTTActivity extends Activity {


	private TextView tvDisplayDate;
	private DatePicker dpResult;
	private Button btnChangeDate;

	private int year;
	private int month;
	private int day;

	private Spinner spinner1;
	private Spinner spinner2;
	
	String[] items;
	
	static final int DATE_DIALOG_ID = 999;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flight_mqtt_activity_main);
		addItemsOnSpinner1();
		addItemsOnSpinner2();
		//setCurrentDateOnView();
		addListenerOnButton();

	}

	// display current date
	public void setCurrentDateOnView() {

		//dpResult = (DatePicker) findViewById(R.id.dpResult);

		final Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);

		// set current date into datepicker
		dpResult.init(year, month, day, null);

	}

	public void addListenerOnButton() {

		btnChangeDate = (Button) findViewById(R.id.btnChangeDate);

		btnChangeDate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				//showDialog(DATE_DIALOG_ID);
	

			}

		});



	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
			// set date picker as current date
			return new DatePickerDialog(this, datePickerListener, year, month,
					day);
		}
		return null;
	}

	private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
			year = selectedYear;
			month = selectedMonth;
			day = selectedDay;

			// set selected date into textview
			tvDisplayDate.setText(new StringBuilder().append(month + 1)
					.append("-").append(day).append("-").append(year)
					.append(" "));

			// set selected date into datepicker also
			dpResult.init(year, month, day, null);

		}
	};
	
	// add items into spinner dynamically
	@SuppressWarnings("unchecked")
	public void addItemsOnSpinner1() {	
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		
		@SuppressWarnings("rawtypes")
		ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, buildAirportList());
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	}
	// add items into spinner dynamically
	@SuppressWarnings("unchecked")
	public void addItemsOnSpinner2() {	
		
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		
		@SuppressWarnings("rawtypes")
		ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, buildAirportList());
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner2.setAdapter(dataAdapter);
	}

	@SuppressLint("NewApi")
	public void showDatePickerDialog(View v) {
	    DialogFragment newFragment = new DatePickerFragment();
	    newFragment.show(getFragmentManager(), "datePicker");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List buildAirportList()
	{
		List list = new ArrayList();
		list.add("Allentown, PA	(ABE)");
		list.add("Abilene, TX (ABI)");
		list.add("Albuquerque, NM (ABQ)");
		list.add("Aberdeen, SD (ABR)");
		list.add("Albany, GA (ABY)");
		list.add("Nantucket, MA	USA	ACK)");
		list.add("Waco, TX	USA	ACT)");
		list.add("Eureka, CA	USA	ACV)");
		list.add("Atlantic City, NJ	USA	ACY)");
		list.add("Kodiak, AK	USA	ADQ)");
		list.add("Alexandria, LA	USA	AEX)");
		list.add("Augusta, GA	USA	AGS)");
		list.add("Athens, GA	USA	AHN)");
		list.add("Alliance, NE	USA	AIA)");
		list.add("King Salmon, AK	USA	AKN)");
		list.add("Albany, NY	USA	ALB)");
		list.add("Waterloo, IA	USA	ALO)");
		list.add("Alamosa, CO	USA	ALS)");
		list.add("Walla Walla, WA	USA	ALW)");
		list.add("Amarillo, TX	USA	AMA)");
		list.add("Anchorage, AK	USA	ANC)");
		list.add("Altoona, PA	USA	AOO)");
		list.add("Naples, FL	USA	APF)");
		list.add("Alpena, MI	USA	APN)");
		list.add("Watertown, NY	USA	ART)");
		list.add("Aspen, CO	USA	ASE)");
		list.add("Atlanta, GA	USA	ATL)");
		list.add("Appleton, WI	USA	ATW)");
		list.add("Watertown, SD	USA	ATY)");
		list.add("Augusta, ME	USA	AUG)");
		list.add("Austin, TX	USA	AUS)");
		list.add("Asheville, NC	USA	AVL)");
		list.add("Wilkes-Barre, PA	USA	AVP)");
		list.add("Kalamazoo, MI	USA	AZO)");
		list.add("Burlington, MA	USA	BBF)");
		list.add("Hartford, CT	USA	BDL)");
		list.add("Bedford, MA	USA	BED)");
		list.add("Bethel, AK	USA	BET)");
		list.add("Scottsbluff, NE	USA	BFF)");
		list.add("Bakersfield, CA	USA	BFL)");
		list.add("Binghamton, NY	USA	BGM)");
		list.add("Bangor, ME	USA	BGR)");
		list.add("Bar Harbor, ME	USA	BHB)");
		list.add("Birmingham, AL	USA	BHM)");
		list.add("Hilo, Hawaii	USA	Big)");
		list.add("Kailua-Kona, Hawaii	USA	Big)");
		list.add("Kamuela, Hawaii	USA	Big)");
		list.add("Billings, MT	USA	BIL)");
		list.add("Bismarck, ND	USA	BIS)");
		list.add("Bemidji, MN	USA	BJI)");
		list.add("Beckley, WV	USA	BKW)");
		list.add("Brookings, SD	USA	BKX)");
		list.add("Bluefield, WV	USA	BLF)");
		list.add("Bellingham, WA	USA	BLI)");
		list.add("Bloomington, IN	USA	BMG)");
		list.add("Bloomington, IL	USA	BMI)");
		list.add("Nashville, TN	USA	BNA)");
		list.add("Boise, ID	USA	BOI)");
		list.add("Boston, MA	USA	BOS)");
		list.add("Beaumont, TX	USA	BPT)");
		list.add("Brunswick, GA	USA	BQK)");
		list.add("Burlington, IA	USA	BRL)");
		list.add("Brownsville, TX	USA	BRO)");
		list.add("Barrow, AK	USA	BRW)");
		list.add("Butte, MT	USA	BTM)");
		list.add("Baton Rouge, LA	USA	BTR)");
		list.add("Bettles, AK	USA	BTT)");
		list.add("Burlington, VT	USA	BTV)");
		list.add("Buffalo, NY	USA	BUF)");
		list.add("Burbank, CA	USA	BUR)");
		list.add("Baltimore, MD	USA	BWI)");
		list.add("Bozeman, MT	USA	BZN)");
		list.add("Columbia, SC	USA	CAE)");
		list.add("Akron, OH	USA	CAK)");
		list.add("Cordova, AK	USA	CDV)");
		list.add("Springfield, MA	USA	CEF)");
		list.add("Cape Girardeau, MO	USA	CGI)");
		list.add("Chattanooga, TN	USA	CHA)");
		list.add("Chicago, IL	USA	CHI)");
		list.add("Charlottesville, VA	USA	CHO)");
		list.add("Charleston, SC	USA	CHS)");
		list.add("Chico, CA	USA	CIC)");
		list.add("Cedar Rapids, IA	USA	CID)");
		list.add("Sault Ste. Marie, MI	USA	CIU)");
		list.add("Clarksburg, WV	USA	CKB)");
		list.add("Carlsbad, CA	USA	CLD)");
		list.add("Cleveland, OH	USA	CLE)");
		list.add("College Station, TX	USA	CLL)");
		list.add("Charlotte, NC	USA	CLT)");
		list.add("Columbus, IN	USA	CLU)");
		list.add("Columbus, OH	USA	CMH)");
		list.add("Champaign, IL	USA	CMI)");
		list.add("Hancock, MI	USA	CMX)");
		list.add("Carlsbad, NM	USA	CNM)");
		list.add("Cody, WY	USA	COD)");
		list.add("Colorado Springs, CO	USA	COS)");
		list.add("Columbia, MO	USA	COU)");
		list.add("Casper, WY	USA	CPR)");
		list.add("Corpus Christi, TX	USA	CRP)");
		list.add("Charleston, WV	USA	CRW)");
		list.add("Columbus, GA	USA	CSG)");
		list.add("Cincinnati, OH	USA	CVG)");
		list.add("Clovis, NM	USA	CVN)");
		list.add("Wausau, WI	USA	CWA)");
		list.add("Cheyenne, WY	USA	CYS)");
		list.add("Daytona Beach, FL	USA	DAB)");
		list.add("Dallas, TX	USA	DAL)");
		list.add("Dayton, OH	USA	DAY)");
		list.add("Dubuque, IA	USA	DBQ)");
		list.add("Washington DC	USA	DCA)");
		list.add("Dodge City, KS	USA	DDC)");
		list.add("Decatur, IL	USA	DEC)");
		list.add("Denver, CO	USA	DEN)");
		list.add("Dallas, TX	USA	DFW)");
		list.add("Dothan, AL	USA	DHN)");
		list.add("Dickinson, ND	USA	DIK)");
		list.add("Dillingham, AK	USA	DLG)");
		list.add("Duluth, MN	USA	DLH)");
		list.add("Durango, CO	USA	DRO)");
		list.add("Des Moines, IA	USA	DSM)");
		list.add("Detroit, MI	USA	DTT)");
		list.add("Detroit, MI	USA	DTW)");
		list.add("Du Bois, PA	USA	DUJ)");
		list.add("Dutch Harbor, Un Island, AK	USA	DUT)");
		list.add("Devils Lake, ND	USA	DVL)");
		list.add("Kearney, NE	USA	EAR)");
		list.add("Wenatchee, WA	USA	EAT)");
		list.add("Eau Claire, WI	USA	EAU)");
		list.add("Eek, AK	USA	EEK)");
		list.add("Houston, TX	USA	EFD)");
		list.add("Vail, CO	USA	EGE)");
		list.add("Elko, NV	USA	EKO)");
		list.add("El Dorado, AR	USA	ELD)");
		list.add("Elmira, NY	USA	ELM)");
		list.add("El Paso, TX	USA	ELP)");
		list.add("Kenai, AK	USA	ENA)");
		list.add("Erie, PA	USA	ERI)");
		list.add("Escanaba, MI	USA	ESC)");
		list.add("Eugene, OR	USA	EUG)");
		list.add("Evansville, IN	USA	EVV)");
		list.add("New Bern, NC	USA	EWN)");
		list.add("Newark, NJ	USA	EWR)");
		list.add("Key West, FL	USA	EYW)");
		list.add("Fairbanks, AK	USA	FAI)");
		list.add("Fargo, ND	USA	FAR)");
		list.add("Fresno, CA	USA	FAT)");
		list.add("Fayetteville, NC	USA	FAY)");
		list.add("Kalispell, MT	USA	FCA)");
		list.add("Flagstaff, AZ	USA	FLG)");
		list.add("Fort Lauderdale, FL	USA	FLL)");
		list.add("Florence, SC	USA	FLO)");
		list.add("Farmington, NM	USA	FMN)");
		list.add("Flint, MI	USA	FNT)");
		list.add("Fort Dodge, IA	USA	FOD)");
		list.add("Sioux Falls, SD	USA	FSD)");
		list.add("Fort Smith, AR	USA	FSM)");
		list.add("Fort Wayne, IN	USA	FWA)");
		list.add("Fort Yukon, AK	USA	FYU)");
		list.add("Great Bend, KS	USA	GBD)");
		list.add("Gillette, WY	USA	GCC)");
		list.add("Garden City, KS	USA	GCK)");
		list.add("Glendive, MT	USA	GDV)");
		list.add("Spokane, WA	USA	GEG)");
		list.add("Grand Forks, ND	USA	GFK)");
		list.add("Longview, TX	USA	GGG)");
		list.add("Grand Junction, CO	USA	GJT)");
		list.add("Greenville, MS	USA	GLH)");
		list.add("Gainesville, FL	USA	GNV)");
		list.add("Gulfport, MS	USA	GPT)");
		list.add("Green Bay, WI	USA	GRB)");
		list.add("Grand Island, NE	USA	GRI)");
		list.add("Killeen, TX	USA	GRK)");
		list.add("Grand Rapids, MI	USA	GRR)");
		list.add("Greensboro, NC	USA	GSO)");
		list.add("Greenville, SC	USA	GSP)");
		list.add("Great Falls, MT	USA	GTF)");
		list.add("Columbus, MS	USA	GTR)");
		list.add("Gunnison, CO	USA	GUC)");
		list.add("Hagerstown, MD	USA	HGR)");
		list.add("Hilton Head Island, SC	USA	HHH)");
		list.add("Hibbing, MN	USA	HIB)");
		list.add("Lake Havasu City, AZ	USA	HII)");
		list.add("Helena, MT	USA	HLN)");
		list.add("Honolulu, Oahu, HI	USA	HNL)");
		list.add("Hana, Maui, HI	USA	HNM)");
		list.add("Hobbs, NM	USA	HOB)");
		list.add("Homer, AK	USA	HOM)");
		list.add("Huron, SD	USA	HON)");
		list.add("Hot Springs, AR	USA	HOT)");
		list.add("Houston, TX	USA	HOU)");
		list.add("White Plains, NY	USA	HPN)");
		list.add("Harlingen, TX	USA	HRL)");
		list.add("Harrison, AR	USA	HRO)");
		list.add("Huntsville, AL	USA	HSV)");
		list.add("Huntington, WV	USA	HTS)");
		list.add("New Haven, CT	USA	HVN)");
		list.add("Havre, MT	USA	HVR)");
		list.add("Hyannis, MA	USA	HYA)");
		list.add("Hays, KS	USA	HYS)");
		list.add("Washington DC	USA	IAD)");
		list.add("Houston, TX	USA	IAH)");
		list.add("Wichita, KS	USA	ICT)");
		list.add("Idaho Falls, ID	USA	IDA)");
		list.add("Kingman, AZ	USA	IGM)");
		list.add("Wilmington, DE	USA	ILG)");
		list.add("Wilmington, NC	USA	ILM)");
		list.add("Iron Mountain, MI	USA	IMT)");
		list.add("Indianapolis, IN	USA	IND)");
		list.add("International Falls, MN	USA	INL)");
		list.add("El Centro, CA	USA	IPL)");
		list.add("Williamsport, PA	USA	IPT)");
		list.add("Kirksville, MO	USA	IRK)");
		list.add("Williston, ND	USA	ISN)");
		list.add("Islip, NY	USA	ISP)");
		list.add("Ithaca, NY	USA	ITH)");
		list.add("Ironwood, MI	USA	IWD)");
		list.add("Inyokern, CA	USA	IYK)");
		list.add("Jackson Hole, WY	USA	JAC)");
		list.add("Jackson, MS	USA	JAN)");
		list.add("Jacksonville, FL	USA	JAX)");
		list.add("Jonesboro, AR	USA	JBR)");
		list.add("New York, NY	USA	JFK)");
		list.add("Kapalua, Maui, HI	USA	JHM)");
		list.add("Jamestown, NY	USA	JHW)");
		list.add("Joplin, MO	USA	JLN)");
		list.add("Jamestown, ND	USA	JMS)");
		list.add("Juneau, AK	USA	JNU)");
		list.add("Johnstown, PA	USA	JST)");
		list.add("Ketchikan, AK	USA	KTN)");
		list.add("Lansing, MI	USA	LAN)");
		list.add("Laramie, WY	USA	LAR)");
		list.add("Las Vegas, NV	USA	LAS)");
		list.add("Lawton, OK	USA	LAW)");
		list.add("Los Angeles, CA	USA	LAX)");
		list.add("Lubbock, TX	USA	LBB)");
		list.add("Latrobe, PA	USA	LBE)");
		list.add("North Platte, NE	USA	LBF)");
		list.add("Liberal, KS	USA	LBL)");
		list.add("Lake Charles, LA	USA	LCH)");
		list.add("Lebanon, NH	USA	LEB)");
		list.add("Lewiston, ME	USA	LEW)");
		list.add("Lexington, KY	USA	LEX)");
		list.add("Lafayette, LA	USA	LFT)");
		list.add("New York, NY	USA	LGA)");
		list.add("Long Beach, CA	USA	LGB)");
		list.add("Lihue, Kauai, HI	USA	LIH)");
		list.add("Little Rock, AR	USA	LIT)");
		list.add("Klamath Falls, OR	USA	LMT)");
		list.add("Lincoln, NE	USA	LNK)");
		list.add("Lancaster, PA	USA	LNS)");
		list.add("Lanai City, Lanai, HI	USA	LNY)");
		list.add("Laredo, TX	USA	LRD)");
		list.add("Las Cruces, NM	USA	LRU)");
		list.add("La Crosse, WI	USA	LSE)");
		list.add("Kalaupapa, Molokai, HI	USA	LUP)");
		list.add("Greenbrier, WV	USA	LWB)");
		list.add("Lewiston, ID	USA	LWS)");
		list.add("Lewistown, MT	USA	LWT)");
		list.add("Lynchburg, VA	USA	LYH)");
		list.add("Midland, TX	USA	MAF)");
		list.add("Manistee, MI	USA	MBL)");
		list.add("Saginaw, MI	USA	MBS)");
		list.add("Kansas City, MO	USA	MCI)");
		list.add("McCook, NE	USA	MCK)");
		list.add("Macon, GA	USA	MCN)");
		list.add("Orlando, FL	USA	MCO)");
		list.add("Mason City, IA	USA	MCW)");
		list.add("Harrisburg, PA	USA	MDT)");
		list.add("Chicago, IL	USA	MDW)");
		list.add("Meridian, MS	USA	MEI)");
		list.add("Memphis, TN	USA	MEM)");
		list.add("McAllen, TX	USA	MFE)");
		list.add("Medford, OR	USA	MFR)");
		list.add("Montgomery, AL	USA	MGM)");
		list.add("Morgantown, WV	USA	MGW)");
		list.add("Manhattan, KS	USA	MHK)");
		list.add("Manchester, NH	USA	MHT)");
		list.add("Miami, FL	USA	MIA)");
		list.add("Milwaukee, WI	USA	MKE)");
		list.add("Muskegon, MI	USA	MKG)");
		list.add("Hoolehua, Molokai, HI	USA	MKK)");
		list.add("Jackson, TN	USA	MKL)");
		list.add("Melbourne, FL	USA	MLB)");
		list.add("Moline, IL	USA	MLI)");
		list.add("Miles City, MT	USA	MLS)");
		list.add("Monroe, LA	USA	MLU)");
		list.add("Mobile, AL	USA	MOB)");
		list.add("Modesto, CA	USA	MOD)");
		list.add("Minot, ND	USA	MOT)");
		list.add("Marquette, MI	USA	MQT)");
		list.add("Monterey, CA	USA	MRY)");
		list.add("Muscle Shoals, AL	USA	MSL)");
		list.add("Madison, WI	USA	MSN)");
		list.add("Missoula, MT	USA	MSO)");
		list.add("Minneapolis, MN	USA	MSP)");
		list.add("Massena, NY	USA	MSS)");
		list.add("New Orleans, LA	USA	MSY)");
		list.add("Montrose, CO	USA	MTJ)");
		list.add("Martha's Vineyard, MA	USA	MVY)");
		list.add("Marion, IL	USA	MWA)");
		list.add("Moses Lake, WA	USA	MWH)");
		list.add("Myrtle Beach, SC	USA	MYR)");
		list.add("New York, NY	USA	NYC)");
		list.add("Jacksonville, NC	USA	OAJ)");
		list.add("Oakland, CA	USA	OAK)");
		list.add("Kahului, Maui, HI	USA	OGG)");
		list.add("Ogdensburg, NY	USA	OGS)");
		list.add("Oklahoma City, OK	USA	OKC)");
		list.add("Wolf Point, MT	USA	OLF)");
		list.add("Columbus, NE	USA	OLU)");
		list.add("Omaha, NE	USA	OMA)");
		list.add("Nome, AK	USA	OME)");
		list.add("Ontario, CA	USA	ONT)");
		list.add("Toksook Bay, AK	USA	OOK)");
		list.add("Chicago, IL	USA	ORD)");
		list.add("Norfolk, VA	USA	ORF)");
		list.add("Oshkosh, WI	USA	OSH)");
		list.add("North Bend, OR	USA	OTH)");
		list.add("Owensboro, KY	USA	OWB)");
		list.add("Oxnard, CA	USA	OXR)");
		list.add("Paducah, KY	USA	PAH)");
		list.add("West Palm Beach, FL	USA	PBI)");
		list.add("Pendleton, OR	USA	PDT)");
		list.add("Portland, OR	USA	PDX)");
		list.add("Panama City, FL	USA	PFN)");
		list.add("Page, AZ	USA	PGA)");
		list.add("Greenville, NC	USA	PGV)");
		list.add("Newport News, VA	USA	PHF)");
		list.add("Philadelphia, PA	USA	PHL)");
		list.add("Phoenix, AZ	USA	PHX)");
		list.add("Peoria, IL	USA	PIA)");
		list.add("Laurel, MS	USA	PIB)");
		list.add("St. Petersburg, FL	USA	PIE)");
		list.add("Pocatello, ID	USA	PIH)");
		list.add("Pierre, SD	USA	PIR)");
		list.add("Pittsburgh, PA	USA	PIT)");
		list.add("Parkersburg, WV	USA	PKB)");
		list.add("Pellston, MI	USA	PLN)");
		list.add("Ponca City, OK	USA	PNC)");
		list.add("Pensacola, FL	USA	PNS)");
		list.add("Presque Isle, ME	USA	PQI)");
		list.add("Prescott, AZ	USA	PRC)");
		list.add("Pasco, WA	USA	PSC)");
		list.add("Portsmouth, NH	USA	PSM)");
		list.add("Palm Springs, CA	USA	PSP)");
		list.add("Pueblo, CO	USA	PUB)");
		list.add("Pullman, WA	USA	PUW)");
		list.add("Provincetown, MA	USA	PVC)");
		list.add("Providence, RI	USA	PVD)");
		list.add("Portland, ME	USA	PWM)");
		list.add("Los Angeles, CA	USA	QLA)");
		list.add("San Francisco, CA	USA	QSF)");
		list.add("Rapid City, SD	USA	RAP)");
		list.add("Redding, CA	USA	RDD)");
		list.add("Redmond, OR	USA	RDM)");
		list.add("Raleigh, NC	USA	RDU)");
		list.add("Rockford, IL	USA	RFD)");
		list.add("Rhinelander, WI	USA	RHI)");
		list.add("Richmond, VA	USA	RIC)");
		list.add("Riverton, WY	USA	RIW)");
		list.add("Rockland, ME	USA	RKD)");
		list.add("Rock Springs, WY	USA	RKS)");
		list.add("Reno, NV	USA	RNO)");
		list.add("Roanoke, VA	USA	ROA)");
		list.add("Rochester, NY	USA	ROC)");
		list.add("Roswell, NM	USA	ROW)");
		list.add("Rochester, MN	USA	RST)");
		list.add("Fort Myers, FL	USA	RSW)");
		list.add("Rutland, VT	USA	RUT)");
		list.add("Santa Fe, NM	USA	SAF)");
		list.add("San Diego, CA	USA	SAN)");
		list.add("San Antonio, TX	USA	SAT)");
		list.add("Savannah, GA	USA	SAV)");
		list.add("Santa Barbara, CA	USA	SBA)");
		list.add("South Bend, IN	USA	SBN)");
		list.add("San Luis Obispo, CA	USA	SBP)");
		list.add("Steamboat Springs, CO	USA	SBS)");
		list.add("Salisbury, MD	USA	SBY)");
		list.add("State College, PA	USA	SCE)");
		list.add("Louisville, KY, USA	USA	SDF)");
		list.add("Sand Point, AK	USA	SDP)");
		list.add("Sidney, MT	USA	SDY)");
		list.add("Seattle, WA	USA	SEA)");
		list.add("San Francisco, CA	USA	SFO)");
		list.add("Springfield, MO	USA	SGF)");
		list.add("St. George, UT	USA	SGU)");
		list.add("Skagway, AK	USA	SGY)");
		list.add("Shenandoah Valley Airport, VA	USA	SHD)");
		list.add("Sheridan, WY	USA	SHR)");
		list.add("Shreveport, LA	USA	SHV)");
		list.add("Sitka, AK	USA	SIT)");
		list.add("San Jose, CA	USA	SJC)");
		list.add("San Angelo, TX	USA	SJT)");
		list.add("Salt Lake City, UT	USA	SLC)");
		list.add("Saranac Lake, NY	USA	SLK)");
		list.add("Salina, KS	USA	SLN)");
		list.add("Sacramento, CA	USA	SMF)");
		list.add("Santa Maria, CA	USA	SMX)");
		list.add("Orange County, CA	USA	SNA)");
		list.add("Pinehurst, NC	USA	SOP)");
		list.add("Springfield, IL	USA	SPI)");
		list.add("Wichita Falls, TX	USA	SPS)");
		list.add("Sarasota, FL	USA	SRQ)");
		list.add("St. Cloud, MN	USA	STC)");
		list.add("St. Louis, MO	USA	STL)");
		list.add("Santa Rosa, CA	USA	STS)");
		list.add("Sun Valley, ID	USA	SUN)");
		list.add("Sioux City, IA	USA	SUX)");
		list.add("Silver City, NM	USA	SVC)");
		list.add("Newburgh, NY	USA	SWF)");
		list.add("Syracuse, NY	USA	SYR)");
		list.add("Fort Leonard Wood, MO	USA	TBN)");
		list.add("Telluride, CO	USA	TEX)");
		list.add("Tallahassee, FL	USA	TLH)");
		list.add("Toledo, OH	USA	TOL)");
		list.add("Topeka, KS	USA	TOP)");
		list.add("Tampa, FL	USA	TPA)");
		list.add("Tri-City Airport, TN	USA	TRI)");
		list.add("Trenton, NJ	USA	TTN)");
		list.add("Tulsa, OK	USA	TUL)");
		list.add("Tupelo, MS	USA	TUP)");
		list.add("Tucson, AZ	USA	TUS)");
		list.add("Traverse City, MI	USA	TVC)");
		list.add("Thief River Falls, MN	USA	TVF)");
		list.add("Twin Falls, ID	USA	TWF)");
		list.add("Texarkana, AR	USA	TXK)");
		list.add("Tyler, TX	USA	TYR)");
		list.add("Knoxville, TN	USA	TYS)");
		list.add("Quincy, IL	USA	UIN)");
		list.add("Unalakleet, AK	USA	UNK)");
		list.add("Victoria, TX	USA	VCT)");
		list.add("Valdez, AK	USA	VDZ)");
		list.add("Visalia, CA	USA	VIS)");
		list.add("Valdosta, GA	USA	VLD)");
		list.add("Fort Walton Beach, FL	USA	VPS)");
		list.add("Springfield, VT	USA	VSF)");
		list.add("Washington DC	USA	WAS)");
		list.add("Enid, OK	USA	WDG)");
		list.add("Wrangell, AK	USA	WRG)");
		list.add("Worland, WY	USA	WRL)");
		list.add("West Yellowstone, MT	USA	WYS)");
		list.add("Fayetteville, AR	USA	XNA)");
		return list;
	}

}
