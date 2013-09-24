Camel Router Spring Project
===========================

To build this project use

    mvn install

To run this example either embed the jar inside Spring
or to run the route from within Maven try

    mvn camel:run

For more help see the Apache Camel documentation

    http://camel.apache.org/

    
    
<?xml version="1.0" encoding="UTF-8"?>
<!-- Configures the Camel Context-->

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:camel="http://camel.apache.org/schema/spring"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
       http://camel.apache.org/schema/spring http://camel.apache.org/schema/spring/camel-spring.xsd">

  <camelContext xmlns="http://camel.apache.org/schema/spring">
    <route>
        <description>here is a sample which processes the input files
         (leaving them in place - see the 'noop' flag)
         then performs content based routing on the message using XPath</description>
        <from uri="file:src/sap-netweaver?fileName=command.txt&amp;noop=true"/>
        <setHeader headerName="CamelNetWeaverCommand">
            <simple>in.body</simple>
        </setHeader>
        <to uri="sap-netweaver:https://sapes1.sapdevcenter.com/sap/opu/odata/IWFND/RMTSAMPLEFLIGHT/?username=P1940066098&amp;password=testpassword&amp;json=false"/>
        <to uri="file:target/data?fileName=OUTPUT_SAP.xml"/>
        <to uri="log:out"/>
        <choice>
            <when>
                <xpath>//entry[contains(id,'AA')]</xpath>
                <log message="\n\nfound AA"/>
                <to uri="log:out"/>
                <stop/>
            </when>
            <otherwise>
                <log message="none"/>
                <stop/>
            </otherwise>
        </choice>
    </route>
</camelContext>

</beans>

our example

<?xml version="1.0" encoding="utf-8"?><entry xml:base="https://sapes1.sapdevcenter.com:443/sap/opu/odata/IWFND/RMTSAMPLEFLIGHT/" xmlns="http://www.w3.org/2005/Atom" xmlns:m="http://schemas.microsoft.com/ado/2007/08/dataservices/metadata" xmlns:d="http://schemas.microsoft.com/ado/2007/08/dataservices"><id>https://sapes1.sapdevcenter.com:443/sap/opu/odata/IWFND/RMTSAMPLEFLIGHT/FlightCollection(carrid='AA',connid='0017',fldate=datetime'2013-09-25T00%3A00%3A00')</id><title type="text">FlightCollection(carrid='AA',connid='0017',fldate=datetime'2013-09-25T00%3A00%3A00')</title><updated>2013-09-22T04:11:17Z</updated><category term="RMTSAMPLEFLIGHT.Flight" scheme="http://schemas.microsoft.com/ado/2007/08/dataservices/scheme"/><link href="FlightCollection(carrid='AA',connid='0017',fldate=datetime'2013-09-25T00%3A00%3A00')" rel="edit" title="Flight"/><link href="FlightCollection(carrid='AA',connid='0017',fldate=datetime'2013-09-25T00%3A00%3A00')/flightbooking" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/flightbooking" type="application/atom+xml;type=entry" title="flightbooking"/><link href="FlightCollection(carrid='AA',connid='0017',fldate=datetime'2013-09-25T00%3A00%3A00')/flightBookings" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/flightBookings" type="application/atom+xml;type=feed" title="flightBookings"/><link href="FlightCollection(carrid='AA',connid='0017',fldate=datetime'2013-09-25T00%3A00%3A00')/FlightCarrier" rel="http://schemas.microsoft.com/ado/2007/08/dataservices/related/FlightCarrier" type="application/atom+xml;type=entry" title="FlightCarrier"/><content type="application/xml"><m:properties><d:flightDetails m:type="RMTSAMPLEFLIGHT.FlightDetails"><d:countryFrom>US</d:countryFrom><d:cityFrom>new york</d:cityFrom><d:airportFrom>JFK</d:airportFrom><d:countryTo>US</d:countryTo><d:cityTo>SAN FRANCISCO</d:cityTo><d:airportTo>SFO</d:airportTo><d:flightTime>361</d:flightTime><d:departureTime>PT11H00M00S</d:departureTime><d:arrivalTime>PT14H01M00S</d:arrivalTime><d:distance>2573.0000</d:distance><d:distanceUnit>SMI</d:distanceUnit><d:flightType/><d:period>0</d:period></d:flightDetails><d:carrid>AA</d:carrid><d:connid>0017</d:connid><d:fldate>2013-09-25T00:00:00</d:fldate><d:PRICE>422.94</d:PRICE><d:CURRENCY>USD</d:CURRENCY><d:PLANETYPE>747-400</d:PLANETYPE><d:SEATSMAX>385</d:SEATSMAX><d:SEATSOCC>368</d:SEATSOCC><d:PAYMENTSUM>187282.26</d:PAYMENTSUM><d:SEATSMAX_B>31</d:SEATSMAX_B><d:SEATSOCC_B>31</d:SEATSOCC_B><d:SEATSMAX_F>21</d:SEATSMAX_F><d:SEATSOCC_F>19</d:SEATSOCC_F></m:properties></content></entry>
