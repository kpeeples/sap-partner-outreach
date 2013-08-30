sap-partner-outreach
====================

Presentation for Fuse and Data Virtualization

Scenario for Demo:

Step 1-
Android and Fuse
Android App allows entry of Airport (possibly by GPS) by drop down
Message sent over MQTT to Fuse Instance
Fuse instance uses camel component for SAP NetWeaver to grab the flight detail
Fuse instance parses flights by airport
flights by airport returned to Android app

Step 2-
Android and Data Virtualization
This step demonstrates a Data Virtualization virtual database (VDB) containing the following sources:
	The OData Flight service from SAP NetWeaver Gateway
	A MySQL Instance with Airport map image file names
	Web service data sources from flightstats.com containing flight and airport specific information

Based on the flight selected in Step 1, a detail screen appears displaying information about the flight:
	(AA) American Airlines - 017
	08:00 AM LAS - 12:00 PM ORD
	GAte C4 Terminal 1
	Seats Available (Seat max - Seat occupied)

A link called "View Airport Maps" pulls in map images for the airport.
A link called "View Google Map" shows a satellite image of the airport which will show details of the airport (restaurants, stores, etc)

A second tab on this page, "Next Flights Available", will display a list of all upcomining flights for the selected departure and target airports. The user will be able to select one of these flights and book a seat. The update will access the SAP NW Gateway service via the data virtualization error. 
 
