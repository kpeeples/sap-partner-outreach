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
	A MySQL Instance with Airport co-ordinates
	An FAA REST Service containing current airport delay and weather conditions

Based on the flight selected in Step 1, a detail screen appears displaying:
	City to/from
	Country to/from
	Airport to/from
	Departuture Time
	Arrival Time
	Carrier ID
	Seats Avalailable (Seat max - Seat occupied)

A link called "Flight Pattern" allows a Google Map view of the flight pattern for the selected flight
plus a marker for each airport using data from all three sources.