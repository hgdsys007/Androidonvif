package com.swx.myapplication;

import android.os.Build;
import android.util.Log;

import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Android Studio.
 * User: 身为行
 * Date: 2020/3/5
 * Time: 16:41
 * Describe: ${as}
 */
public class RespeonXml {
    private static final RespeonXml ourInstance = new RespeonXml();
    private String ip = "http://192.168.10.175:2000";

    public static RespeonXml getInstance() {
        return ourInstance;
    }

    private RespeonXml() {


    }

    public StringBuilder getStringBuilder(){
        StringBuilder buffer = new StringBuilder();
        buffer.delete(0,buffer.length());
        buffer.append("<?xml \n" +
                "version=\"1.0\" \n" +
                " encoding=\"UTF-8\" ?>\r\n");
        buffer.append("<SOAP-ENV:Envelope\r\n");
        buffer.append("xmlns:SOAP-ENV=\"http://www.w3.org/2003/05/soap-envelope\"\n");
        buffer.append("xmlns:SOAP-ENC=\"http://www.w3.org/2003/05/soap-encoding\"\n");
        buffer.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n");
        buffer.append("xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"\n");
        buffer.append("xmlns:wsa=\"http://schemas.xmlsoap.org/ws/2004/08/addressing\"\n");
        buffer.append("xmlns:wsdd=\"http://schemas.xmlsoap.org/ws/2005/04/discovery\"\n");
        buffer.append("xmlns:wsa5=\"http://www.w3.org/2005/08/addressing\"\n");
        buffer.append("xmlns:c14n=\"http://www.w3.org/2001/10/xml-exc-c14n#\"\n");
        buffer.append("xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\"\n");
        buffer.append("xmlns:xenc=\"http://www.w3.org/2001/04/xmlenc#\"\n");
        buffer.append("xmlns:wsc=\"http://schemas.xmlsoap.org/ws/2005/02/sc\"\n");
        buffer.append("xmlns:ds=\"http://www.w3.org/2000/09/xmldsig#\"\n");
        buffer.append("xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\"\n");
        buffer.append("xmlns:xmime=\"http://tempuri.org/xmime.xsd\"\n");
        buffer.append("xmlns:xop=\"http://www.w3.org/2004/08/xop/include\"\n");
        buffer.append("xmlns:wsrfbf=\"http://docs.oasis-open.org/wsrf/bf-2\"\n");
        buffer.append("xmlns:tt=\"http://www.onvif.org/ver10/schema\"\n");
        buffer.append("xmlns:wstop=\"http://docs.oasis-open.org/wsn/t-1\"\n");
        buffer.append("xmlns:wsrfr=\"http://docs.oasis-open.org/wsrf/r-2\"\n");
        buffer.append("xmlns:dndl=\"http://www.onvif.org/ver10/network/wsdl/DiscoveryLookupBinding\"\n");
        buffer.append("xmlns:dnrd=\"http://www.onvif.org/ver10/network/wsdl/RemoteDiscoveryBinding\"\n");
        buffer.append("xmlns:dn=\"http://www.onvif.org/ver10/network/wsdl\"\n");
        buffer.append("xmlns:tanae=\"http://www.onvif.org/ver20/analytics/wsdl/AnalyticsEngineBinding\"\n");
        buffer.append("xmlns:tanre=\"http://www.onvif.org/ver20/analytics/wsdl/RuleEngineBinding\"\n");
        buffer.append("xmlns:tan=\"http://www.onvif.org/ver20/analytics/wsdl\"\n");
        buffer.append("xmlns:tds=\"http://www.onvif.org/ver10/device/wsdl\"\n");
        buffer.append("xmlns:tevcpp=\"http://www.onvif.org/ver10/events/wsdl/CreatePullPointBinding\"\n");
        buffer.append("xmlns:teve=\"http://www.onvif.org/ver10/events/wsdl/EventBinding\"\n");
        buffer.append("xmlns:tevnc=\"http://www.onvif.org/ver10/events/wsdl/NotificationConsumerBinding\"\n");
        buffer.append("xmlns:tevnp=\"http://www.onvif.org/ver10/events/wsdl/NotificationProducerBinding\"\n");
        buffer.append("xmlns:tevpp=\"http://www.onvif.org/ver10/events/wsdl/PullPointBinding\"\n");
        buffer.append("xmlns:tevpps=\"http://www.onvif.org/ver10/events/wsdl/PullPointSubscriptionBinding\"\n");
        buffer.append("xmlns:tev=\"http://www.onvif.org/ver10/events/wsdl\"\n");
        buffer.append("xmlns:tevpsm=\"http://www.onvif.org/ver10/events/wsdl/PausableSubscriptionManagerBinding\"\n");
        buffer.append("xmlns:wsnt=\"http://docs.oasis-open.org/wsn/b-2\"\n");
        buffer.append("xmlns:tevsm=\"http://www.onvif.org/ver10/events/wsdl/SubscriptionManagerBinding\"\n");
        buffer.append("xmlns:timg=\"http://www.onvif.org/ver20/imaging/wsdl\"\n");
        buffer.append("xmlns:tmd=\"http://www.onvif.org/ver10/deviceIO/wsdl\"\n");
        buffer.append("xmlns:tptz=\"http://www.onvif.org/ver20/ptz/wsdl\"\n");
        buffer.append("xmlns:trp=\"http://www.onvif.org/ver10/replay/wsdl\"\n");
        buffer.append("xmlns:trt=\"http://www.onvif.org/ver10/media/wsdl\"\n");
        buffer.append("xmlns:ter=\"http://www.onvif.org/ver10/error\"\n");
        buffer.append("xmlns:tns1=\"http://www.onvif.org/ver10/topics\">\n");

        return buffer;
    }

    public StringBuilder GetSystemDateAndTime(){
        Calendar cal = Calendar.getInstance();
        //当前年
        int year = cal.get(Calendar.YEAR);
        //当前月
        int month = (cal.get(Calendar.MONTH))+1;
        //当前月的第几天：即当前日
        int day_of_month = cal.get(Calendar.DAY_OF_MONTH);
        //当前时：HOUR_OF_DAY-24小时制；HOUR-12小时制
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        //当前分
        int minute = cal.get(Calendar.MINUTE);
        //当前秒
        int second = cal.get(Calendar.SECOND);
        //0-上午；1-下午
        int ampm = cal.get(Calendar.AM_PM);
        //当前年的第几周
        int week_of_year = cal.get(Calendar.WEEK_OF_YEAR);
        //当前月的第几周
        int week_of_month = cal.get(Calendar.WEEK_OF_MONTH);
        //当前年的第几天
        int day_of_year = cal.get(Calendar.DAY_OF_YEAR);

        StringBuilder buffer = getStringBuilder();
        buffer.append("<SOAP-ENV:Body>");
        buffer.append("<tds:GetSystemDateAndTimeResponse>\n");
        buffer.append("<tds:SystemDateAndTime>\n");
        buffer.append("<tt:DateTimeType>\n");
        buffer.append(""+month);
        buffer.append("</tt:DateTimeType>\n");
        buffer.append("<tt:DaylightSaving>\n");
        buffer.append("false");
        buffer.append("</tt:DaylightSaving>\n");
        buffer.append("<tt:TimeZone>\n");
        buffer.append("<tt:TZ>\n");
        buffer.append("GMT+08");
        buffer.append("</tt:TZ>\n");
        buffer.append("</tt:TimeZone>\n");
        buffer.append("<tt:UTCDateTime>\n");
        buffer.append("<tt:Time>\n");
        buffer.append("<tt:Hour>\n");
        buffer.append(""+hour);
        buffer.append("</tt:Hour>\n");
        buffer.append("<tt:Minute>\n");
        buffer.append(""+minute);
        buffer.append("</tt:Minute>\n");
        buffer.append("<tt:Second>\n");
        buffer.append(""+second);
        buffer.append("</tt:Second>\n");
        buffer.append("</tt:Time>\n");
        buffer.append("<tt:Date>\n");
        buffer.append("<tt:Year>\n");
        buffer.append(""+year);
        buffer.append("</tt:Year>\n");
        buffer.append("<tt:Month>\n");
        buffer.append(""+month);
        buffer.append("</tt:Month>\n");
        buffer.append("<tt:Day>\n");
        buffer.append(""+day_of_month);
        buffer.append("</tt:Day>\n");
        buffer.append("</tt:Date>\n");
        buffer.append("</tt:UTCDateTime>\n");
        buffer.append("<tt:LocalDateTime>\n");
        buffer.append("<tt:Time>\n");
        buffer.append("<tt:Hour>\n");
        buffer.append(""+hour);
        buffer.append("</tt:Hour>\n");
        buffer.append("<tt:Minute>\n");
        buffer.append(""+minute);
        buffer.append("</tt:Minute>\n");
        buffer.append("<tt:Second>\n");
        buffer.append(""+second);
        buffer.append("</tt:Second>\n");
        buffer.append("</tt:Time>\n");
        buffer.append("<tt:Date>\n");
        buffer.append("<tt:Year>\n");
        buffer.append(""+year);
        buffer.append("</tt:Year>\n");
        buffer.append("<tt:Month>\n");
        buffer.append(""+month);
        buffer.append("</tt:Month>\n");
        buffer.append("<tt:Day>\n");
        buffer.append(""+day_of_month);
        buffer.append("</tt:Day>\n");
        buffer.append("</tt:Date>\n");
        buffer.append("</tt:LocalDateTime>\n");
        buffer.append("</tds:SystemDateAndTime>\n");
        buffer.append("</tds:GetSystemDateAndTimeResponse>\n");
        buffer.append("</SOAP-ENV:Body>");
        buffer.append("</SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetCapabilities(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tds:GetCapabilitiesResponse>" +
                "                <tds:Capabilities>" +
                "                    <tt:Analytics>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.175:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:RuleSupport>" +
                "                            true" +
                "                            </tt:RuleSupport>" +
                "                        <tt:AnalyticsModuleSupport>" +
                "                            true" +
                "                            </tt:AnalyticsModuleSupport>" +
                "                        </tt:Analytics>" +
                "                    <tt:Device>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.175:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:Network>" +
                "                            <tt:IPFilter>" +
                "                                true" +
                "                                </tt:IPFilter>" +
                "                            <tt:ZeroConfiguration>" +
                "                                true" +
                "                                </tt:ZeroConfiguration>" +
                "                            <tt:IPVersion6>" +
                "                                false" +
                "                                </tt:IPVersion6>" +
                "                            <tt:DynDNS>" +
                "                                true" +
                "                                </tt:DynDNS>" +
                "                            <tt:Extension>" +
                "                                <tt:Dot11Configuration>" +
                "                                    true" +
                "                                    </tt:Dot11Configuration>" +
                "                                </tt:Extension>" +
                "                            </tt:Network>" +
                "                        <tt:System>" +
                "                            <tt:DiscoveryResolve>" +
                "                                true" +
                "                                </tt:DiscoveryResolve>" +
                "                            <tt:DiscoveryBye>" +
                "                                true" +
                "                                </tt:DiscoveryBye>" +
                "                            <tt:RemoteDiscovery>" +
                "                                true" +
                "                                </tt:RemoteDiscovery>" +
                "                            <tt:SystemBackup>" +
                "                                false" +
                "                                </tt:SystemBackup>" +
                "                            <tt:SystemLogging>" +
                "                                false" +
                "                                </tt:SystemLogging>" +
                "                            <tt:FirmwareUpgrade>" +
                "                                true" +
                "                                </tt:FirmwareUpgrade>" +
                "                            <tt:SupportedVersions>" +
                "                                <tt:Major>" +
                "                                    2" +
                "                                    </tt:Major>" +
                "                                <tt:Minor>" +
                "                                    41" +
                "                                    </tt:Minor>" +
                "                                </tt:SupportedVersions>" +
                "                            <tt:Extension>" +
                "                                <tt:HttpFirmwareUpgrade>" +
                "                                    true" +
                "                                    </tt:HttpFirmwareUpgrade>" +
                "                                <tt:HttpSystemBackup>" +
                "                                    false" +
                "                                    </tt:HttpSystemBackup>" +
                "                                <tt:HttpSystemLogging>" +
                "                                    false" +
                "                                    </tt:HttpSystemLogging>" +
                "                                <tt:HttpSupportInformation>" +
                "                                    false" +
                "                                    </tt:HttpSupportInformation>" +
                "                                </tt:Extension>" +
                "                            </tt:System>" +
                "                        <tt:IO>" +
                "                            <tt:InputConnectors>" +
                "                                1" +
                "                                </tt:InputConnectors>" +
                "                            <tt:RelayOutputs>" +
                "                                1" +
                "                                </tt:RelayOutputs>" +
                "                            </tt:IO>" +
                "                        <tt:Security>" +
                "                            <tt:TLS1.1>" +
                "                                false" +
                "                                </tt:TLS1.1>" +
                "                            <tt:TLS1.2>" +
                "                                false" +
                "                                </tt:TLS1.2>" +
                "                            <tt:OnboardKeyGeneration>" +
                "                                false" +
                "                                </tt:OnboardKeyGeneration>" +
                "                            <tt:AccessPolicyConfig>" +
                "                                false" +
                "                                </tt:AccessPolicyConfig>" +
                "                            <tt:X.509Token>" +
                "                                false" +
                "                                </tt:X.509Token>" +
                "                            <tt:SAMLToken>" +
                "                                false" +
                "                                </tt:SAMLToken>" +
                "                            <tt:KerberosToken>" +
                "                                false" +
                "                                </tt:KerberosToken>" +
                "                            <tt:RELToken>" +
                "                                false" +
                "                                </tt:RELToken>" +
                "                            </tt:Security>" +
                "                        </tt:Device>" +
                "                    <tt:Events>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.175:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:WSSubscriptionPolicySupport>" +
                "                            true" +
                "                            </tt:WSSubscriptionPolicySupport>" +
                "                        <tt:WSPullPointSupport>" +
                "                            true" +
                "                            </tt:WSPullPointSupport>" +
                "                        <tt:WSPausableSubscriptionManagerInterfaceSupport>" +
                "                            true" +
                "                            </tt:WSPausableSubscriptionManagerInterfaceSupport>" +
                "                        </tt:Events>" +
                "                    <tt:Imaging>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.175:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        </tt:Imaging>" +
                "                    <tt:Media>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.175:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:StreamingCapabilities>" +
                "                            <tt:RTPMulticast>" +
                "                                true" +
                "                                </tt:RTPMulticast>" +
                "                            <tt:RTP_TCP>" +
                "                                true" +
                "                                </tt:RTP_TCP>" +
                "                            <tt:RTP_RTSP_TCP>" +
                "                                true" +
                "                                </tt:RTP_RTSP_TCP>" +
                "                            <tt:Extension>" +
                "                                <tt:ProfileCapabilities>" +
                "                                    <tt:MaximumNumberOfProfiles>" +
                "                                        10" +
                "                                        </tt:MaximumNumberOfProfiles>" +
                "                                    </tt:ProfileCapabilities>" +
                "                                </tt:Extension>" +
                "                            </tt:StreamingCapabilities>" +
                "                        </tt:Media>" +
                "                    <tt:PTZ>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.175:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        </tt:PTZ>" +
                "                    <tt:Extension>" +
                "                        <tt:DeviceIO>" +
                "                            <tt:XAddr>" +
                "                                http://192.168.10.175:2000/onvif/device_service" +
                "                                </tt:XAddr>" +
                "                            <tt:VideoSources>" +
                "                                1" +
                "                                </tt:VideoSources>" +
                "                            <tt:VideoOutputs>" +
                "                                0" +
                "                                </tt:VideoOutputs>" +
                "                            <tt:AudioSources>" +
                "                                1" +
                "                                </tt:AudioSources>" +
                "                            <tt:AudioOutputs>" +
                "                                1" +
                "                                </tt:AudioOutputs>" +
                "                            <tt:RelayOutputs>" +
                "                                1" +
                "                                </tt:RelayOutputs>" +
                "                            </tt:DeviceIO>" +
                "                        <tt:Extensions>" +
                "                            <tt:TelexCapabilities>" +
                "                                <tt:XAddr>" +
                "                                    http://192.168.10.175:2000/onvif/device_service" +
                "                                    </tt:XAddr>" +
                "                                <tt:PTZ3DZoomSupport>" +
                "                                    true" +
                "                                    </tt:PTZ3DZoomSupport>" +
                "                                <tt:PTZAuxSwitchSupport>" +
                "                                    true" +
                "                                    </tt:PTZAuxSwitchSupport>" +
                "                                <tt:MotionDetectorSupport>" +
                "                                    true" +
                "                                    </tt:MotionDetectorSupport>" +
                "                                <tt:TamperDetectorSupport>" +
                "                                    true" +
                "                                    </tt:TamperDetectorSupport>" +
                "                                </tt:TelexCapabilities>" +
                "                            </tt:Extensions>" +
                "                        </tt:Extension>" +
                "                    </tds:Capabilities>" +
                "                </tds:GetCapabilitiesResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetCapabilities2(String subStr) {
        StringBuilder buffer = getStringBuilder();
        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tds:GetCapabilitiesResponse>" +
                "                <tds:Capabilities>" +
                "                    <tt:Analytics>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.223:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:RuleSupport>" +
                "                            true" +
                "                            </tt:RuleSupport>" +
                "                        <tt:AnalyticsModuleSupport>" +
                "                            true" +
                "                            </tt:AnalyticsModuleSupport>" +
                "                        </tt:Analytics>" +
                "                    <tt:Device>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.223:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:Network>" +
                "                            <tt:IPFilter>" +
                "                                true" +
                "                                </tt:IPFilter>" +
                "                            <tt:ZeroConfiguration>" +
                "                                true" +
                "                                </tt:ZeroConfiguration>" +
                "                            <tt:IPVersion6>" +
                "                                false" +
                "                                </tt:IPVersion6>" +
                "                            <tt:DynDNS>" +
                "                                true" +
                "                                </tt:DynDNS>" +
                "                            <tt:Extension>" +
                "                                <tt:Dot11Configuration>" +
                "                                    true" +
                "                                    </tt:Dot11Configuration>" +
                "                                </tt:Extension>" +
                "                            </tt:Network>" +
                "                        <tt:System>" +
                "                            <tt:DiscoveryResolve>" +
                "                                true" +
                "                                </tt:DiscoveryResolve>" +
                "                            <tt:DiscoveryBye>" +
                "                                true" +
                "                                </tt:DiscoveryBye>" +
                "                            <tt:RemoteDiscovery>" +
                "                                true" +
                "                                </tt:RemoteDiscovery>" +
                "                            <tt:SystemBackup>" +
                "                                false\n" +
                "                                </tt:SystemBackup>" +
                "                            <tt:SystemLogging>" +
                "                                false" +
                "                                </tt:SystemLogging>" +
                "                            <tt:FirmwareUpgrade>" +
                "                                true" +
                "                                </tt:FirmwareUpgrade>" +
                "                            <tt:SupportedVersions>" +
                "                                <tt:Major>" +
                "                                    2" +
                "                                    </tt:Major>" +
                "                                <tt:Minor>" +
                "                                    41" +
                "                                    </tt:Minor>" +
                "                                </tt:SupportedVersions>" +
                "                            <tt:Extension>" +
                "                                <tt:HttpFirmwareUpgrade>" +
                "                                    true" +
                "                                    </tt:HttpFirmwareUpgrade>" +
                "                                <tt:HttpSystemBackup>" +
                "                                    false" +
                "                                    </tt:HttpSystemBackup>" +
                "                                <tt:HttpSystemLogging>" +
                "                                    false" +
                "                                    </tt:HttpSystemLogging>" +
                "                                <tt:HttpSupportInformation>" +
                "                                    false" +
                "                                    </tt:HttpSupportInformation>" +
                "                                </tt:Extension>" +
                "                            </tt:System>" +
                "                        <tt:IO>" +
                "                            <tt:InputConnectors>" +
                "                                1" +
                "                                </tt:InputConnectors>" +
                "                            <tt:RelayOutputs>" +
                "                                1" +
                "                                </tt:RelayOutputs>" +
                "                            </tt:IO>" +
                "                        <tt:Security>" +
                "                            <tt:TLS1.1>" +
                "                                false" +
                "                                </tt:TLS1.1>" +
                "                            <tt:TLS1.2>" +
                "                                false" +
                "                                </tt:TLS1.2>" +
                "                            <tt:OnboardKeyGeneration>" +
                "                                false" +
                "                                </tt:OnboardKeyGeneration>" +
                "                            <tt:AccessPolicyConfig>" +
                "                                false" +
                "                                </tt:AccessPolicyConfig>" +
                "                            <tt:X.509Token>" +
                "                                false" +
                "                                </tt:X.509Token>" +
                "                            <tt:SAMLToken>" +
                "                                false" +
                "                                </tt:SAMLToken>" +
                "                            <tt:KerberosToken>" +
                "                                false" +
                "                                </tt:KerberosToken>" +
                "                            <tt:RELToken>" +
                "                                false" +
                "                                </tt:RELToken>" +
                "                            </tt:Security>" +
                "                        </tt:Device>" +
                "                    <tt:Events>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.223:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:WSSubscriptionPolicySupport>" +
                "                            true" +
                "                            </tt:WSSubscriptionPolicySupport>" +
                "                        <tt:WSPullPointSupport>" +
                "                            true" +
                "                            </tt:WSPullPointSupport>" +
                "                        <tt:WSPausableSubscriptionManagerInterfaceSupport>" +
                "                            true" +
                "                            </tt:WSPausableSubscriptionManagerInterfaceSupport>" +
                "                        </tt:Events>" +
                "                    <tt:Imaging>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.223:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        </tt:Imaging>" +
                "                    <tt:Media>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.223:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        <tt:StreamingCapabilities>" +
                "                            <tt:RTPMulticast>" +
                "                                true" +
                "                                </tt:RTPMulticast>" +
                "                            <tt:RTP_TCP>" +
                "                                true" +
                "                                </tt:RTP_TCP>" +
                "                            <tt:RTP_RTSP_TCP>" +
                "                                true" +
                "                                </tt:RTP_RTSP_TCP>" +
                "                            <tt:Extension>" +
                "                                <tt:ProfileCapabilities>" +
                "                                    <tt:MaximumNumberOfProfiles>" +
                "                                        10" +
                "                                        </tt:MaximumNumberOfProfiles>" +
                "                                    </tt:ProfileCapabilities>" +
                "                                </tt:Extension>" +
                "                            </tt:StreamingCapabilities>" +
                "                        </tt:Media>" +
                "                    <tt:PTZ>" +
                "                        <tt:XAddr>" +
                "                            http://192.168.10.223:2000/onvif/device_service" +
                "                            </tt:XAddr>" +
                "                        </tt:PTZ>" +
                "                    <tt:Extension>" +
                "                        <tt:DeviceIO>" +
                "                            <tt:XAddr>" +
                "                                http://192.168.10.223:2000/onvif/device_service" +
                "                                </tt:XAddr>" +
                "                            <tt:VideoSources>" +
                "                                1" +
                "                                </tt:VideoSources>" +
                "                            <tt:VideoOutputs>" +
                "                                0" +
                "                                </tt:VideoOutputs>" +
                "                            <tt:AudioSources>" +
                "                                1" +
                "                                </tt:AudioSources>" +
                "                            <tt:AudioOutputs>" +
                "                                1" +
                "                                </tt:AudioOutputs>" +
                "                            <tt:RelayOutputs>" +
                "                                1" +
                "                                </tt:RelayOutputs>" +
                "                            </tt:DeviceIO>" +
                "                        <tt:Extensions>" +
                "                            <tt:TelexCapabilities>" +
                "                                <tt:XAddr>" +
                "                                    http://192.168.10.223:2000/onvif/device_service" +
                "                                    </tt:XAddr>" +
                "                                <tt:PTZ3DZoomSupport>" +
                "                                    true" +
                "                                    </tt:PTZ3DZoomSupport>" +
                "                                <tt:PTZAuxSwitchSupport>" +
                "                                    true" +
                "                                    </tt:PTZAuxSwitchSupport>" +
                "                                <tt:MotionDetectorSupport>" +
                "                                    true" +
                "                                    </tt:MotionDetectorSupport>" +
                "                                <tt:TamperDetectorSupport>" +
                "                                    true" +
                "                                    </tt:TamperDetectorSupport>" +
                "                                </tt:TelexCapabilities>" +
                "                            </tt:Extensions>" +
                "                        </tt:Extension>" +
                "                    </tds:Capabilities>" +
                "                </tds:GetCapabilitiesResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }
    public StringBuilder GetProfiles(String subStr) {
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetProfilesResponse>" +
                "                <trt:Profiles \n" +
                "                    fixed=\"true\"\n" +
                "                    token=\"profile1\">" +
                "                    <tt:Name>" +
                "                        profile1" +
                "                        </tt:Name>" +
                "                    <tt:VideoSourceConfiguration\n" +
                "                        token=\"VideoSourceConfiguration1\">" +
                "                        <tt:Name>" +
                "                            VideoSourceConfiguration1" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            2" +
                "                            </tt:UseCount>" +
                "                        <tt:SourceToken>" +
                "                            VideoSource1" +
                "                            </tt:SourceToken>" +
                "                        <tt:Bounds\n" +
                "                            height=\"240\"\n" +
                "                            width=\"320\"\n" +
                "                            y=\"0\"\n" +
                "                            x=\"0\">" +
                "                            </tt:Bounds>" +
                "                        </tt:VideoSourceConfiguration>" +
                "                    <tt:AudioSourceConfiguration\n" +
                "                        token=\"AudioSourceConfiguration1\">" +
                "                        <tt:Name>" +
                "                            AudioSourceConfiguration1" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            2" +
                "                            </tt:UseCount>" +
                "                        <tt:SourceToken>" +
                "                            AudioSource1" +
                "                            </tt:SourceToken>" +
                "                        </tt:AudioSourceConfiguration>" +
                "                    <tt:VideoEncoderConfiguration \n" +
                "                        token=\"VideoEncoderConfiguration1\">" +
                "                        <tt:Name>" +
                "                            VideoEncoderConfiguration1" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            1" +
                "                            </tt:UseCount>" +
                "                        <tt:Encoding>" +
                "                            H264" +
                "                            </tt:Encoding>" +
                "                        <tt:Resolution>" +
                "                            <tt:Width>" +
                "                                320" +
                "                                </tt:Width>" +
                "                            <tt:Height>" +
                "                                240" +
                "                                </tt:Height>" +
                "                            </tt:Resolution>" +
                "                        <tt:Quality>" +
                "                            5" +
                "                            </tt:Quality>" +
                "                        <tt:RateControl>" +
                "                            <tt:FrameRateLimit>" +
                "                                20" +
                "                                </tt:FrameRateLimit>" +
                "                            <tt:EncodingInterval>" +
                "                                1" +
                "                                </tt:EncodingInterval>" +
                "                            <tt:BitrateLimit>" +
                "                                4608" +
                "                                </tt:BitrateLimit>" +
                "                            </tt:RateControl>" +
                "                        <tt:H264>" +
                "                            <tt:GovLength>" +
                "                                75" +
                "                                </tt:GovLength>" +
                "                            <tt:H264Profile>" +
                "                                Main" +
                "                                </tt:H264Profile>" +
                "                            </tt:H264>" +
                "                        <tt:Multicast>" +
                "                            <tt:Address>" +
                "                                <tt:Type>" +
                "                                    IPv4" +
                "                                    </tt:Type>" +
                "                                </tt:Address>" +
                "                            <tt:Port>" +
                "                                0" +
                "                                </tt:Port>" +
                "                            <tt:TTL>" +
                "                                0" +
                "                                </tt:TTL>" +
                "                            <tt:AutoStart>" +
                "                                false" +
                "                                </tt:AutoStart>" +
                "                            </tt:Multicast>" +
                "                        <tt:SessionTimeout>" +
                "                            PT30M" +
                "                            </tt:SessionTimeout>" +
                "                        </tt:VideoEncoderConfiguration>" +
                "                    <tt:AudioEncoderConfiguration \n" +
                "                        token=\"AudioEncoderConfiguration1\">" +
                "                        <tt:Name>" +
                "                            AudioEncoderConfiguration1" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            2" +
                "                            </tt:UseCount>" +
                "                        <tt:Encoding>" +
                "                            G711" +
                "                            </tt:Encoding>" +
                "                        <tt:Bitrate>" +
                "                            16" +
                "                            </tt:Bitrate>" +
                "                        <tt:SampleRate>" +
                "                            8" +
                "                            </tt:SampleRate>" +
                "                        <tt:Multicast>" +
                "                            <tt:Address>" +
                "                                <tt:Type>" +
                "                                    IPv4" +
                "                                    </tt:Type>" +
                "                                </tt:Address>" +
                "                            <tt:Port>" +
                "                                0" +
                "                                </tt:Port>" +
                "                            <tt:TTL>" +
                "                                0" +
                "                                </tt:TTL>" +
                "                            <tt:AutoStart>" +
                "                                false" +
                "                                </tt:AutoStart>" +
                "                            </tt:Multicast>" +
                "                        <tt:SessionTimeout>" +
                "                            PT30M" +
                "                            </tt:SessionTimeout>" +
                "                        </tt:AudioEncoderConfiguration>" +
                "                    <tt:VideoAnalyticsConfiguration \n" +
                "                        token=\"VideoAnalyticsToken\">" +
                "                        <tt:Name>" +
                "                            VideoAnalyticsName" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            2" +
                "                            </tt:UseCount>" +
                "                        <tt:AnalyticsEngineConfiguration>" +
                "                            <tt:AnalyticsModule \n" +
                "                                Name=\"MyCellMotionModule\" \n" +
                "                                Type=\"tt:CellMotionEngine\">" +
                "                                <tt:Parameters>" +
                "                                    <tt:SimpleItem \n" +
                "                                        Value=\"100\"\n" +
                "                                        Name=\"Sensitivity\">" +
                "                                        </tt:SimpleItem>" +
                "                                    <tt:ElementItem\n" +
                "                                        Name=\"Layout\">" +
                "                                        <tt:CellLayout\n" +
                "                                            Columns=\"22\"\n" +
                "                                            Rows=\"18\">" +
                "                                            <tt:Transformation>" +
                "                                                <tt:Translate\n" +
                "                                                    x=\"-1.000000\"\n" +
                "                                                    y=\"-1.000000\"/>" +
                "                                                <tt:Scale\n" +
                "                                                    x=\"0.001563\"\n" +
                "                                                    y=\"0.002778\"/>" +
                "                                                </tt:Transformation>" +
                "                                            </tt:CellLayout>" +
                "                                        </tt:ElementItem>" +
                "                                    </tt:Parameters>" +
                "                                </tt:AnalyticsModule>" +
                "                            </tt:AnalyticsEngineConfiguration>" +
                "                        <tt:RuleEngineConfiguration>" +
                "                            <tt:Rule\n" +
                "                                Name=\"MyMotionDetectorRule\"\n" +
                "                                Type=\"tt:CellMotionDetector\">" +
                "                                <tt:Parameters>" +
                "                                    <tt:SimpleItem\n" +
                "                                        Value=\"5\"\n" +
                "                                        Name=\"MinCount\">" +
                "                                        </tt:SimpleItem>" +
                "                                    <tt:SimpleItem\n" +
                "                                        Value=\"100\"\n" +
                "                                        Name=\"AlarmOnDelay\">" +
                "                                        </tt:SimpleItem>" +
                "                                    <tt:SimpleItem\n" +
                "                                        Value=\"100\"\n" +
                "                                        Name=\"AlarmOffDelay\">" +
                "                                        </tt:SimpleItem>" +
                "                                    <tt:SimpleItem\n" +
                "                                        Value=\"0P8A8A==\"\n" +
                "                                        Name=\"ActiveCells\">" +
                "                                        </tt:SimpleItem>" +
                "                                    </tt:Parameters>" +
                "                                </tt:Rule>" +
                "                            </tt:RuleEngineConfiguration>" +
                "                        </tt:VideoAnalyticsConfiguration>" +
                "                    <tt:PTZConfiguration\n" +
                "                        token=\"onvif_ptz_1\">" +
                "                        <tt:Name>" +
                "                            onvif_ptz_1" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            2" +
                "                            </tt:UseCount>" +
                "                        <tt:NodeToken>" +
                "                            onvif_ptz_1" +
                "                            </tt:NodeToken>" +
                "                        <tt:DefaultAbsolutePantTiltPositionSpace>" +
                "                            http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace" +
                "                            </tt:DefaultAbsolutePantTiltPositionSpace>" +
                "                        <tt:DefaultAbsoluteZoomPositionSpace>" +
                "                            http://www.onvif.org/ver10/tptz/ZoomSpaces/PositionGenericSpace" +
                "                            </tt:DefaultAbsoluteZoomPositionSpace>" +
                "                        <tt:DefaultRelativePanTiltTranslationSpace>" +
                "                            http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationGenericSpace" +
                "                            </tt:DefaultRelativePanTiltTranslationSpace>" +
                "                        <tt:DefaultRelativeZoomTranslationSpace>" +
                "                            http://www.onvif.org/ver10/tptz/ZoomSpaces/TranslationGenericSpace" +
                "                            </tt:DefaultRelativeZoomTranslationSpace>" +
                "                        <tt:DefaultContinuousPanTiltVelocitySpace>" +
                "                            http://www.onvif.org/ver10/tptz/PanTiltSpaces/VelocityGenericSpace" +
                "                            </tt:DefaultContinuousPanTiltVelocitySpace>" +
                "                        <tt:DefaultContinuousZoomVelocitySpace>" +
                "                            http://www.onvif.org/ver10/tptz/ZoomSpaces/VelocityGenericSpace" +
                "                            </tt:DefaultContinuousZoomVelocitySpace>" +
                "                        <tt:DefaultPTZSpeed>" +
                "                            <tt:PanTilt\n" +
                "                                space=\"http://www.onvif.org/ver10/tptz/PanTiltSpaces/GenericSpeedSpace\"\n" +
                "                                y=\"1.0\"\n" +
                "                                x=\"1.0\">" +
                "                                </tt:PanTilt>" +
                "                            <tt:Zoom\n" +
                "                                space=\"http://www.onvif.org/ver10/tptz/ZoomSpaces/ZoomGenericSpeedSpace\"\n" +
                "                                x=\"1.0\">" +
                "                                </tt:Zoom>" +
                "                            </tt:DefaultPTZSpeed>" +
                "                        <tt:DefaultPTZTimeout>" +
                "                            PT30M" +
                "                            </tt:DefaultPTZTimeout>" +
                "                        <tt:PanTiltLimits>" +
                "                            <tt:Range>" +
                "                                <tt:URI>" +
                "                                    http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace" +
                "                                    </tt:URI>" +
                "                                <tt:XRange>" +
                "                                    <tt:Min>" +
                "                                        -1.0" +
                "                                        </tt:Min>" +
                "                                    <tt:Max>" +
                "                                        1.0" +
                "                                        </tt:Max>" +
                "                                    </tt:XRange>" +
                "                                <tt:YRange>" +
                "                                    <tt:Min>" +
                "                                        -1.0" +
                "                                        </tt:Min>" +
                "                                    <tt:Max>" +
                "                                        1.0" +
                "                                        </tt:Max>" +
                "                                    </tt:YRange>" +
                "                                </tt:Range>" +
                "                            </tt:PanTiltLimits>" +
                "                        <tt:ZoomLimits>" +
                "                            <tt:Range>" +
                "                                <tt:URI>" +
                "                                    http://www.onvif.org/ver10/tptz/ZoomSpaces/PositionGenericSpace" +
                "                                    </tt:URI>" +
                "                                <tt:XRange>" +
                "                                    <tt:Min>" +
                "                                        -1.0" +
                "                                        </tt:Min>" +
                "                                    <tt:Max>" +
                "                                        1.0" +
                "                                        </tt:Max>" +
                "                                    </tt:XRange>" +
                "                                </tt:Range>" +
                "                            </tt:ZoomLimits>" +
                "                        </tt:PTZConfiguration>" +
                "                    <tt:MetadataConfiguration\n" +
                "                        token=\"user1\">" +
                "                        <tt:Name>" +
                "                            user1" +
                "                            </tt:Name>" +
                "                        <tt:UseCount>" +
                "                            0" +
                "                            </tt:UseCount>" +
                "                        <tt:Multicast>" +
                "                            <tt:Address>" +
                "                                <tt:Type>" +
                "                                    IPv4" +
                "                                    </tt:Type>" +
                "                                <tt:IPv4Address>" +
                "                                    0.0.0.0" +
                "                                    </tt:IPv4Address>" +
                "                                </tt:Address>" +
                "                            <tt:Port>" +
                "                                0" +
                "                                </tt:Port>" +
                "                            <tt:TTL>" +
                "                                5" +
                "                                </tt:TTL>" +
                "                            <tt:AutoStart>" +
                "                                false" +
                "                                </tt:AutoStart>" +
                "                            </tt:Multicast>" +
                "                        <tt:SessionTimeout>" +
                "                            PT30M" +
                "                            </tt:SessionTimeout>" +
                "                        </tt:MetadataConfiguration>" +
                "                    </trt:Profiles>" +
                "                </trt:GetProfilesResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }
    public StringBuilder GetProfiles1(String subStr) {
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "<trt:GetProfilesResponse>" +
                "<trt:Profiles " +
                "fixed=\"true\"" +
                "token=\"profile0\">" +
                "<tt:Name>" +
                "profile0" +
                "</tt:Name>" +
                "<tt:VideoSourceConfiguration " +
                "token=\"VideoSourceConfiguration0\">" +
                "<tt:Name>" +
                "VideoSourceConfiguration0" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "2" +
                "</tt:UseCount>" +
                "<tt:SourceToken>" +
                "VideoSource0" +
                "</tt:SourceToken>" +
                "<tt:Bounds " +
                "height=\"240\" " +
                "width=\"320\" " +
                "y=\"0\" " +
                "x=\"0\">" +
                "</tt:Bounds>" +
                "</tt:VideoSourceConfiguration>" +
                "<tt:AudioSourceConfiguration " +
                "token=\"AudioSourceConfiguration0\">" +
                "<tt:Name>" +
                "AudioSourceConfiguration0" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "2" +
                "</tt:UseCount>" +
                "<tt:SourceToken>" +
                "AudioSource0" +
                "</tt:SourceToken>" +
                "</tt:AudioSourceConfiguration>" +
                "<tt:VideoEncoderConfiguration " +
                "token=\"VideoEncoderConfiguration0\">" +
                "<tt:Name>" +
                "VideoEncoderConfiguration0" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "1" +
                "</tt:UseCount>" +
                "<tt:Encoding>" +
                "H264" +
                "</tt:Encoding>" +
                "<tt:Resolution>" +
                "<tt:Width>" +
                "320" +
                "</tt:Width>" +
                "<tt:Height>" +
                "240" +
                "</tt:Height>" +
                "</tt:Resolution>" +
                "<tt:Quality>" +
                "5" +
                "</tt:Quality>" +
                "<tt:RateControl>" +
                "<tt:FrameRateLimit>" +
                "20" +
                "</tt:FrameRateLimit>" +
                "<tt:EncodingInterval>" +
                "1" +
                "</tt:EncodingInterval>" +
                "<tt:BitrateLimit>" +
                "4608" +
                "</tt:BitrateLimit>" +
                "</tt:RateControl>" +
                "<tt:H264>" +
                "<tt:GovLength>" +
                "75" +
                "</tt:GovLength>" +
                "<tt:H264Profile>" +
                "Main" +
                "</tt:H264Profile>" +
                "</tt:H264>" +
                "<tt:Multicast>" +
                "<tt:Address>" +
                "<tt:Type>" +
                "IPv4" +
                "</tt:Type>" +
                "</tt:Address>" +
                "<tt:Port>" +
                "0" +
                "</tt:Port>" +
                "<tt:TTL>" +
                "0" +
                "</tt:TTL>" +
                "<tt:AutoStart>" +
                "false" +
                "</tt:AutoStart>" +
                "</tt:Multicast>" +
                "<tt:SessionTimeout>" +
                "PT30M" +
                "</tt:SessionTimeout>" +
                "</tt:VideoEncoderConfiguration>" +
                "<tt:AudioEncoderConfiguration \n" +
                "token=\"AudioEncoderConfiguration0\">" +
                "<tt:Name>" +
                "AudioEncoderConfiguration0" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "2" +
                "</tt:UseCount>" +
//                "<tt:Encoding>" +
//                "G711" +
//                "</tt:Encoding>" +
                "<tt:Bitrate>" +
                "16" +
                "</tt:Bitrate>" +
                "<tt:SampleRate>" +
                "8" +
                "</tt:SampleRate>" +
                "<tt:Multicast>" +
                "<tt:Address>" +
                "<tt:Type>" +
                "IPv4" +
                "</tt:Type>" +
                "</tt:Address>" +
                "<tt:Port>" +
                "0" +
                "</tt:Port>" +
                "<tt:TTL>" +
                "0" +
                "</tt:TTL>" +
                "<tt:AutoStart>" +
                "false" +
                "</tt:AutoStart>" +
                "</tt:Multicast>" +
                "<tt:SessionTimeout>" +
                "PT30M" +
                "</tt:SessionTimeout>" +
                "</tt:AudioEncoderConfiguration>" +
                "<tt:VideoAnalyticsConfiguration " +
                "token=\"VideoAnalyticsToken\">" +
                "<tt:Name>" +
                "VideoAnalyticsName" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "2" +
                "</tt:UseCount>" +
                "<tt:AnalyticsEngineConfiguration>" +
                "<tt:AnalyticsModule " +
                "Name=\"MyCellMotionModule\" " +
                "Type=\"tt:CellMotionEngine\">" +
                "<tt:Parameters>" +
                "<tt:SimpleItem " +
                "Value=\"100\" " +
                "Name=\"Sensitivity\">" +
                "</tt:SimpleItem>" +
                "<tt:ElementItem " +
                "Name=\"Layout\">" +
                "<tt:CellLayout " +
                "Columns=\"22\" " +
                "Rows=\"18\">" +
                "<tt:Transformation>" +
                "<tt:Translate " +
                "x=\"-1.000000\" " +
                "y=\"-1.000000\"/>" +
                "<tt:Scale " +
                "x=\"0.001563\" " +
                "y=\"0.002778\"/>" +
                "</tt:Transformation>" +
                "</tt:CellLayout>" +
                "</tt:ElementItem>" +
                "</tt:Parameters>" +
                "</tt:AnalyticsModule>" +
                "</tt:AnalyticsEngineConfiguration>" +
                "<tt:RuleEngineConfiguration>" +
                "<tt:Rule " +
                "Name=\"MyMotionDetectorRule\" " +
                "Type=\"tt:CellMotionDetector\">" +
                "<tt:Parameters>" +
                "<tt:SimpleItem " +
                "Value=\"5\" " +
                "Name=\"MinCount\">" +
                "</tt:SimpleItem>" +
                "<tt:SimpleItem " +
                "Value=\"100\" " +
                "Name=\"AlarmOnDelay\">" +
                "</tt:SimpleItem>" +
                "<tt:SimpleItem " +
                "Value=\"100\" " +
                "Name=\"AlarmOffDelay\">" +
                "</tt:SimpleItem>" +
                "<tt:SimpleItem " +
                "Value=\"0P8A8A==\" " +
                "Name=\"ActiveCells\">" +
                "</tt:SimpleItem>" +
                "</tt:Parameters>" +
                "</tt:Rule>" +
                "</tt:RuleEngineConfiguration>" +
                "</tt:VideoAnalyticsConfiguration>" +
                "<tt:PTZConfiguration " +
                "token=\"onvif_ptz_0\">" +
                "<tt:Name>" +
                "onvif_ptz_0" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "2" +
                "</tt:UseCount>" +
                "<tt:NodeToken>" +
                "onvif_ptz_0" +
                "</tt:NodeToken>" +
                "<tt:DefaultAbsolutePantTiltPositionSpace>" +
                "http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace" +
                "</tt:DefaultAbsolutePantTiltPositionSpace>" +
                "<tt:DefaultAbsoluteZoomPositionSpace>" +
                "http://www.onvif.org/ver10/tptz/ZoomSpaces/PositionGenericSpace" +
                "</tt:DefaultAbsoluteZoomPositionSpace>" +
                "<tt:DefaultRelativePanTiltTranslationSpace>" +
                "http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationGenericSpace" +
                "</tt:DefaultRelativePanTiltTranslationSpace>" +
                "<tt:DefaultRelativeZoomTranslationSpace>" +
                "http://www.onvif.org/ver10/tptz/ZoomSpaces/TranslationGenericSpace" +
                "</tt:DefaultRelativeZoomTranslationSpace>" +
                "<tt:DefaultContinuousPanTiltVelocitySpace>" +
                "http://www.onvif.org/ver10/tptz/PanTiltSpaces/VelocityGenericSpace" +
                "</tt:DefaultContinuousPanTiltVelocitySpace>" +
                "<tt:DefaultContinuousZoomVelocitySpace>" +
                "http://www.onvif.org/ver10/tptz/ZoomSpaces/VelocityGenericSpace" +
                "</tt:DefaultContinuousZoomVelocitySpace>" +
                "<tt:DefaultPTZSpeed>" +
                "<tt:PanTilt " +
                "space=\"http://www.onvif.org/ver10/tptz/PanTiltSpaces/GenericSpeedSpace\" " +
                "y=\"1.0\" " +
                "x=\"1.0\">" +
                "</tt:PanTilt>" +
                "<tt:Zoom " +
                "space=\"http://www.onvif.org/ver10/tptz/ZoomSpaces/ZoomGenericSpeedSpace\" " +
                "x=\"1.0\">" +
                "</tt:Zoom>" +
                "</tt:DefaultPTZSpeed>" +
                "<tt:DefaultPTZTimeout>" +
                "PT30M" +
                "</tt:DefaultPTZTimeout>" +
                "<tt:PanTiltLimits>" +
                "<tt:Range>" +
                "<tt:URI>" +
                "http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace" +
                "</tt:URI>" +
                "<tt:XRange>" +
                "<tt:Min>" +
                "-1.0" +
                "</tt:Min>" +
                "<tt:Max>" +
                "1.0" +
                "</tt:Max>" +
                "</tt:XRange>" +
                "<tt:YRange>" +
                "<tt:Min>" +
                "-1.0" +
                "</tt:Min>" +
                "<tt:Max>" +
                "1.0" +
                "</tt:Max>" +
                "</tt:YRange>" +
                "</tt:Range>" +
                "</tt:PanTiltLimits>" +
                "<tt:ZoomLimits>" +
                "<tt:Range>" +
                "<tt:URI>" +
                "http://www.onvif.org/ver10/tptz/ZoomSpaces/PositionGenericSpace" +
                "</tt:URI>" +
                "<tt:XRange>" +
                "<tt:Min>" +
                "-1.0" +
                "</tt:Min>" +
                "<tt:Max>" +
                "1.0" +
                "</tt:Max>" +
                "</tt:XRange>" +
                "</tt:Range>" +
                "</tt:ZoomLimits>" +
                "</tt:PTZConfiguration>" +
                "<tt:MetadataConfiguration\n" +
                "token=\"user0\">" +
                "<tt:Name>" +
                "user0" +
                "</tt:Name>" +
                "<tt:UseCount>" +
                "0" +
                "</tt:UseCount>" +
                "<tt:Multicast>" +
                "<tt:Address>" +
                "<tt:Type>" +
                "IPv4" +
                "</tt:Type>" +
                "<tt:IPv4Address>" +
                "0.0.0.0" +
                "</tt:IPv4Address>" +
                "</tt:Address>" +
                "<tt:Port>" +
                "0" +
                "</tt:Port>" +
                "<tt:TTL>" +
                "5" +
                "</tt:TTL>" +
                "<tt:AutoStart>" +
                "false" +
                "</tt:AutoStart>" +
                "</tt:Multicast>" +
                "<tt:SessionTimeout>" +
                "PT30M" +
                "</tt:SessionTimeout>" +
                "</tt:MetadataConfiguration>" +
                "</trt:Profiles>" +
                "</trt:GetProfilesResponse>" +
                "</SOAP-ENV:Body>" +
                "</SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetVideoAnalyticsConfigurations(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetVideoAnalyticsConfigurationsResponse>" +
                "                <trt:Configurations\n" +
                "                    token=\"VideoAnalyticsToken\">" +
                "                    <tt:Name>" +
                "                        VideoAnalyticsName" +
                "                        </tt:Name>" +
                "                    <tt:UseCount>" +
                "                        2" +
                "                        </tt:UseCount>" +
                "                    <tt:AnalyticsEngineConfiguration>" +
                "                        <tt:AnalyticsModule\n" +
                "                            Name=\"MyCellMotionModule\"\n" +
                "                            Type=\"tt:CellMotionEngine\">" +
                "                            <tt:Parameters>" +
                "                                <tt:SimpleItem\n" +
                "                                    Value=\"100\"\n" +
                "                                    Name=\"Sensitivity\">" +
                "                                    </tt:SimpleItem>" +
                "                                <tt:ElementItem\n" +
                "                                    Name=\"Layout\">" +
                "                                    <tt:CellLayout\n" +
                "                                        Columns=\"22\"\n" +
                "                                        Rows=\"18\">" +
                "                                        <tt:Transformation>" +
                "                                            <tt:Translate\n" +
                "                                                x=\"-1.000000\"\n" +
                "                                                y=\"-1.000000\"/>" +
                "                                            <tt:Scale\n" +
                "                                                x=\"0.001563\"\n" +
                "                                                y=\"0.002778\"/>" +
                "                                            </tt:Transformation>" +
                "                                        </tt:CellLayout>" +
                "                                    </tt:ElementItem>" +
                "                                </tt:Parameters>" +
                "                            </tt:AnalyticsModule>" +
                "                        </tt:AnalyticsEngineConfiguration>" +
                "                    <tt:RuleEngineConfiguration>" +
                "                        <tt:Rule\n" +
                "                            Name=\"MyMotionDetectorRule\"\n" +
                "                            Type=\"tt:CellMotionDetector\">" +
                "                            <tt:Parameters>" +
                "                                <tt:SimpleItem\n" +
                "                                    Value=\"5\"\n" +
                "                                    Name=\"MinCount\">" +
                "                                    </tt:SimpleItem>" +
                "                                <tt:SimpleItem\n" +
                "                                    Value=\"100\"\n" +
                "                                    Name=\"AlarmOnDelay\">" +
                "                                    </tt:SimpleItem>" +
                "                                <tt:SimpleItem\n" +
                "                                    Value=\"100\"\n" +
                "                                    Name=\"AlarmOffDelay\">" +
                "                                    </tt:SimpleItem>" +
                "                                <tt:SimpleItem\n" +
                "                                    Value=\"0P8A8A==\"\n" +
                "                                    Name=\"ActiveCells\">" +
                "                                    </tt:SimpleItem>" +
                "                                </tt:Parameters>" +
                "                            </tt:Rule>" +
                "                        </tt:RuleEngineConfiguration>" +
                "                    </trt:Configurations>" +
                "                </trt:GetVideoAnalyticsConfigurationsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetNetworkInterfaces(String subStr) {
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tds:GetNetworkInterfacesResponse>" +
                "                <tds:NetworkInterfaces\n" +
                "                    token=\"eth0\">" +
                "                    <tt:Enabled>" +
                "                        true" +
                "                        </tt:Enabled>" +
                "                    <tt:Info>" +
                "                        <tt:Name>" +
                "                            NetworkInterface" +
                "                            </tt:Name>" +
                "                        <tt:HwAddress>" +
                "                            5C:F2:86:88:1B:81" +
                "                            </tt:HwAddress>" +
                "                        <tt:MTU>" +
                "                            1500" +
                "                            </tt:MTU>" +
                "                        </tt:Info>" +
                "                    <tt:Link>" +
                "                        <tt:AdminSettings>" +
                "                            <tt:AutoNegotiation>" +
                "                                true" +
                "                                </tt:AutoNegotiation>" +
                "                            <tt:Speed>" +
                "                                100" +
                "                                </tt:Speed>" +
                "                            <tt:Duplex>" +
                "                                Full" +
                "                                </tt:Duplex>" +
                "                            </tt:AdminSettings>" +
                "                        <tt:OperSettings>" +
                "                            <tt:AutoNegotiation>" +
                "                                true" +
                "                                </tt:AutoNegotiation>" +
                "                            <tt:Speed>" +
                "                                100" +
                "                                </tt:Speed>" +
                "                            <tt:Duplex>" +
                "                                Full" +
                "                                </tt:Duplex>" +
                "                            </tt:OperSettings>" +
                "                        <tt:InterfaceType>" +
                "                            0" +
                "                            </tt:InterfaceType>" +
                "                        </tt:Link>" +
                "                    <tt:IPv4>" +
                "                        <tt:Enabled>" +
                "                            true" +
                "                            </tt:Enabled>" +
                "                        <tt:Config>" +
                "                            <tt:Manual>" +
                "                                <tt:Address>" +
                "                                    192.168.10.175" +
                "                                    </tt:Address>" +
                "                                <tt:PrefixLength>" +
                "                                    24" +
                "                                    </tt:PrefixLength>" +
                "                                </tt:Manual>" +
                "                            <tt:LinkLocal>" +
                "                                <tt:Address>" +
                "                                    169.254.201.33" +
                "                                    </tt:Address>" +
                "                                <tt:PrefixLength>" +
                "                                    16" +
                "                                    </tt:PrefixLength>" +
                "                                </tt:LinkLocal>" +
                "                            <tt:FromDHCP>" +
                "                                <tt:Address>" +
                "                                    192.168.10.175" +
                "                                    </tt:Address>" +
                "                                <tt:PrefixLength>" +
                "                                    24" +
                "                                    </tt:PrefixLength>" +
                "                                </tt:FromDHCP>" +
                "                            <tt:DHCP>" +
                "                                false" +
                "                                </tt:DHCP>" +
                "                            </tt:Config>" +
                "                        </tt:IPv4>" +
                "                    </tds:NetworkInterfaces>" +
                "                </tds:GetNetworkInterfacesResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    private static String getSerialNumber() {
        String serial = null;
        try {
            Class<?> c = Class.forName("android.os.SystemProperties");
            Method get = c.getMethod("get", String.class);
            serial = (String) get.invoke(c, "ro.serialno");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serial;
    }

    public StringBuilder GetDeviceInformation(String subStr) {
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "<tds:GetDeviceInformationResponse>" +
                "<tds:Manufacturer>" +"czht"+
//                "Network Digital Video" +
                "</tds:Manufacturer>" +
                "<tds:Model>" +"MJ"+
//                "HIHD_T" +
                "</tds:Model>" +
                "<tds:FirmwareVersion>" + Build.VERSION.RELEASE+
//                "                    2.1.0.3.4.19_5.0.67 Beta" +
                "</tds:FirmwareVersion>" +
                "<tds:SerialNumber>" +getSerialNumber()+
//                "                    717330" +
                "</tds:SerialNumber>" +
                "<tds:HardwareId>" +Build.SERIAL+
//                "IPCamera" +
                "</tds:HardwareId>" +
                "</tds:GetDeviceInformationResponse>" +
                "</SOAP-ENV:Body>" +
                "</SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetConfigurationOptions(String subStr) {
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tptz:GetConfigurationOptionsResponse>" +
                "                <tptz:PTZConfigurationOptions>" +
                "                    <tt:Spaces>" +
                "                        <tt:AbsolutePanTiltPositionSpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/PanTiltSpaces/PositionGenericSpace " +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            <tt:YRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:YRange>" +
                "                            </tt:AbsolutePanTiltPositionSpace>" +
                "                        <tt:AbsoluteZoomPositionSpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/ZoomSpaces/PositionGenericSpace" +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            </tt:AbsoluteZoomPositionSpace>" +
                "                        <tt:RelativePanTiltTranslationSpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/PanTiltSpaces/TranslationGenericSpace" +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            <tt:YRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:YRange>" +
                "                            </tt:RelativePanTiltTranslationSpace>" +
                "                        <tt:RelativeZoomTranslationSpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/ZoomSpaces/TranslationGenericSpace" +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            </tt:RelativeZoomTranslationSpace>" +
                "                        <tt:ContinuousPanTiltVelocitySpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/PanTiltSpaces/VelocityGenericSpace" +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            <tt:YRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:YRange>" +
                "                            </tt:ContinuousPanTiltVelocitySpace>" +
                "                        <tt:ContinuousZoomVelocitySpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/ZoomSpaces/VelocityGenericSpace " +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            </tt:ContinuousZoomVelocitySpace>" +
                "                        <tt:PanTiltSpeedSpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/PanTiltSpaces/GenericSpeedSpace" +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            </tt:PanTiltSpeedSpace>" +
                "                        <tt:ZoomSpeedSpace>" +
                "                            <tt:URI>" +
                "                                http://www.onvif.org/ver10/tptz/ZoomSpaces/ZoomGenericSpeedSpace" +
                "                                </tt:URI>" +
                "                            <tt:XRange>" +
                "                                <tt:Min>" +
                "                                    -1" +
                "                                    </tt:Min>" +
                "                                <tt:Max>" +
                "                                    1" +
                "                                    </tt:Max>" +
                "                                </tt:XRange>" +
                "                            </tt:ZoomSpeedSpace>" +
                "                        </tt:Spaces>" +
//                "                    <tt:PTZTimeout>" +
//                "                        <tt:Min>" +
//                "                            PT30S" +
//                "                            </tt:Min>" +
//                "                        <tt:Max>" +
//                "                            PT3M" +
//                "                            </tt:Max>" +
//                "                        </tt:PTZTimeout>" +
                "                    </tptz:PTZConfigurationOptions>" +
                "                </tptz:GetConfigurationOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetPresets(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tptz:GetPresetsResponse>" +
                "                </tptz:GetPresetsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetPresetTours(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tptz:GetPresetToursResponse/>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder CreatePresetTour(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tptz:CreatePresetTourResponse>" +
                "                <tptz:PresetTourToken>" +
                "                    0" +
                "                    </tptz:PresetTourToken>" +
                "                </tptz:CreatePresetTourResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetOptions(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <timg:GetOptionsResponse>" +
                "                <timg:ImagingOptions>" +
                "                    <tt:BacklightCompensation>" +
                "                        <tt:Mode>" +
                "                            ON" +
                "                            </tt:Mode>" +
                "                        <tt:Mode>" +
                "                            OFF" +
                "                            </tt:Mode>" +
                "                        <tt:Level>" +
                "                            <tt:Min>" +
                "                                0" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                255" +
                "                                </tt:Max>" +
                "                            </tt:Level>" +
                "                        </tt:BacklightCompensation>" +
                "                    <tt:Brightness>" +
                "                        <tt:Min>" +
                "                            0" +
                "                            </tt:Min>" +
                "                        <tt:Max>" +
                "                            255" +
                "                            </tt:Max>" +
                "                        </tt:Brightness>" +
                "                    <tt:ColorSaturation>" +
                "                        <tt:Min>" +
                "                            0" +
                "                            </tt:Min>" +
                "                        <tt:Max>" +
                "                            255" +
                "                            </tt:Max>" +
                "                        </tt:ColorSaturation>" +
                "                    <tt:Contrast>" +
                "                        <tt:Min>" +
                "                            0" +
                "                            </tt:Min>" +
                "                        <tt:Max>" +
                "                            255" +
                "                            </tt:Max>" +
                "                        </tt:Contrast>" +
                "                    <tt:Exposure>" +
                "                        <tt:Mode>" +
                "                            MANUAL" +
                "                            </tt:Mode>" +
                "                        <tt:Mode>" +
                "                            AUTO" +
                "                            </tt:Mode>" +
                "                        <tt:Priority>" +
                "                            FrameRate" +
                "                            </tt:Priority>" +
                "                        <tt:Priority>" +
                "                            LowNoise" +
                "                            </tt:Priority>" +
                "                        <tt:MinExposureTime>" +
                "                            <tt:Min>" +
                "                                1" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                1" +
                "                                </tt:Max>" +
                "                            </tt:MinExposureTime>" +
                "                        <tt:MaxExposureTime>" +
                "                            <tt:Min>" +
                "                                30000" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                30000" +
                "                                </tt:Max>" +
                "                            </tt:MaxExposureTime>" +
                "                        <tt:MinGain>" +
                "                            <tt:Min>" +
                "                                0" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                0" +
                "                                </tt:Max>" +
                "                            </tt:MinGain>" +
                "                        <tt:MaxGain>" +
                "                            <tt:Min>" +
                "                                255" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                255" +
                "                                </tt:Max>" +
                "                            </tt:MaxGain>" +
                "                        <tt:MinIris>" +
                "                            <tt:Min>" +
                "                                0" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                0" +
                "                                </tt:Max>" +
                "                            </tt:MinIris>" +
                "                        <tt:MaxIris>" +
                "                            <tt:Min>" +
                "                                255" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                255" +
                "                                </tt:Max>" +
                "                            </tt:MaxIris>" +
                "                        <tt:ExposureTime>" +
                "                            <tt:Min>" +
                "                                1" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                30000" +
                "                                </tt:Max>" +
                "                            </tt:ExposureTime>" +
                "                        <tt:Gain>" +
                "                            <tt:Min>" +
                "                                0" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                255" +
                "                                </tt:Max>" +
                "                            </tt:Gain>" +
                "                        <tt:Iris>" +
                "                            <tt:Min>" +
                "                                0" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                255" +
                "                                </tt:Max>" +
                "                            </tt:Iris>" +
                "                        </tt:Exposure>" +
                "                    <tt:IrCutFilterModes>" +
                "                        AUTO" +
                "                        </tt:IrCutFilterModes>" +
                "                    <tt:Sharpness>" +
                "                        <tt:Min>" +
                "                            0" +
                "                            </tt:Min>" +
                "                        <tt:Max>" +
                "                            255" +
                "                            </tt:Max>" +
                "                        </tt:Sharpness>" +
                "                    </timg:ImagingOptions>" +
                "                </timg:GetOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetMoveOptions(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <timg:GetMoveOptionsResponse>" +
                "                <timg:MoveOptions>" +
                "                    <tt:Continuous>" +
                "                        <tt:Speed>" +
                "                            <tt:Min>" +
                "                                -1" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                1" +
                "                                </tt:Max>" +
                "                            </tt:Speed>" +
                "                        </tt:Continuous>" +
                "                    </timg:MoveOptions>" +
                "                </timg:GetMoveOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetOSDOptions(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetOSDOptionsResponse>" +
                "                <trt:OSDOptions>" +
                "                    <tt:MaximumNumberOfOSDs\n" +
                "                        DateAndTime=\"1\"\n" +
                "                        Time=\"1\"\n" +
                "                        Date=\"1\"\n" +
                "                        PlainText=\"1\"\n" +
                "                        Image=\"0\"\n" +
                "                        Total=\"2\">" +
                "                        </tt:MaximumNumberOfOSDs>" +
                "                    <tt:PositionOption>" +
                "                        UpperLeft" +
                "                        </tt:PositionOption>" +
                "                    <tt:PositionOption>" +
                "                        LowerLeft" +
                "                        </tt:PositionOption>" +
                "                    <tt:PositionOption>" +
                "                        Custom" +
                "                        </tt:PositionOption>" +
                "                    <tt:TextOption>" +
                "                        <tt:Type>" +
                "                            Plain" +
                "                            </tt:Type>" +
                "                        <tt:Type>" +
                "                            Date" +
                "                            </tt:Type>" +
                "                        <tt:Type>" +
                "                            Time" +
                "                            </tt:Type>" +
                "                        <tt:Type>" +
                "                            DateAndTime" +
                "                            </tt:Type>" +
                "                        <tt:FontSizeRange>" +
                "                            <tt:Min>" +
                "                                8" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                16" +
                "                                </tt:Max>" +
                "                            </tt:FontSizeRange>" +
                "                        <tt:DateFormat>" +
                "                            YYYY-MM-DD" +
                "                            </tt:DateFormat>" +
                "                        <tt:DateFormat>" +
                "                            MM-DD-YYYY" +
                "                            </tt:DateFormat>" +
                "                        <tt:DateFormat>" +
                "                            DD-MM-YYYY" +
                "                            </tt:DateFormat>" +
                "                        <tt:DateFormat>" +
                "                            yyyy/MM/dd" +
                "                            </tt:DateFormat>" +
                "                        <tt:DateFormat>" +
                "                            yyyy-MM-dd" +
                "                            </tt:DateFormat>" +
                "                        <tt:DateFormat>" +
                "                            MM/dd/yyyy" +
                "                            </tt:DateFormat>" +
                "                        <tt:DateFormat>" +
                "                            dd/MM/yyyy" +
                "                            </tt:DateFormat>" +
                "                        <tt:TimeFormat>" +
                "                            HH:mm:ss" +
                "                            </tt:TimeFormat>" +
                "                        <tt:TimeFormat>" +
                "                            hh:mm:ss tt" +
                "                            </tt:TimeFormat>" +
                "                        </tt:TextOption>" +
                "                    </trt:OSDOptions>" +
                "                </trt:GetOSDOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetVideoEncoderConfigurationOptions(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetVideoEncoderConfigurationOptionsResponse>" +
                "                <trt:Options>" +
                "                    <tt:QualityRange>" +
                "                        <tt:Min>" +
                "                            1" +
                "                            </tt:Min>" +
                "                        <tt:Max>" +
                "                            6" +
                "                            </tt:Max>" +
                "                        </tt:QualityRange>" +
                "                    <tt:JPEG>" +
                "                        <tt:ResolutionsAvailable>" +
                "                            <tt:Width>" +
                "                                320" +
                "                                </tt:Width>" +
                "                            <tt:Height>" +
                "                                240" +
                "                                </tt:Height>" +
                "                            </tt:ResolutionsAvailable>" +
                "                        <tt:ResolutionsAvailable>" +
                "                            <tt:Width>" +
                "                                320" +
                "                                </tt:Width>" +
                "                            <tt:Height>" +
                "                                240" +
                "                                </tt:Height>" +
                "                            </tt:ResolutionsAvailable>" +
                "                        <tt:FrameRateRange>" +
                "                            <tt:Min>" +
                "                                1" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                30" +
                "                                </tt:Max>" +
                "                            </tt:FrameRateRange>" +
                "                        <tt:EncodingIntervalRange>" +
                "                            <tt:Min>" +
                "                                1" +
                "                                </tt:Min>" +
                "                            <tt:Max>" +
                "                                200" +
                "                                </tt:Max>" +
                "                            </tt:EncodingIntervalRange>" +
                "                        </tt:JPEG>" +
//                "                    <tt:H264>" +
//                "                        <tt:ResolutionsAvailable>" +
//                "                            <tt:Width>" +
//                "                                320" +
//                "                                </tt:Width>" +
//                "                            <tt:Height>" +
//                "                                240" +
//                "                                </tt:Height>" +
//                "                            </tt:ResolutionsAvailable>" +
//                "                        <tt:ResolutionsAvailable>" +
//                "                            <tt:Width>" +
//                "                                1280" +
//                "                                </tt:Width>" +
//                "                            <tt:Height>" +
//                "                                720" +
//                "                                </tt:Height>" +
//                "                            </tt:ResolutionsAvailable>" +
//                "                        <tt:GovLengthRange>" +
//                "                            <tt:Min>" +
//                "                                1" +
//                "                                </tt:Min>" +
//                "                            <tt:Max>" +
//                "                                200" +
//                "                                </tt:Max>" +
//                "                            </tt:GovLengthRange>" +
//                "                        <tt:FrameRateRange>" +
//                "                            <tt:Min>" +
//                "                                1" +
//                "                                </tt:Min>" +
//                "                            <tt:Max>" +
//                "                                30" +
//                "                                </tt:Max>" +
//                "                            </tt:FrameRateRange>" +
//                "                        <tt:EncodingIntervalRange>" +
//                "                            <tt:Min>" +
//                "                                1" +
//                "                                </tt:Min>" +
//                "                            <tt:Max>" +
//                "                                200" +
//                "                                </tt:Max>" +
//                "                            </tt:EncodingIntervalRange>" +
//                "                        <tt:H264ProfilesSupported>" +
//                "                            Baseline" +
//                "                            </tt:H264ProfilesSupported>" +
//                "                        <tt:H264ProfilesSupported>" +
//                "                            Main" +
//                "                            </tt:H264ProfilesSupported>" +
//                "                        </tt:H264>" +
                "                    </trt:Options>" +
                "                </trt:GetVideoEncoderConfigurationOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetVideoEncoderConfiguration(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetVideoEncoderConfigurationResponse>" +
                "                <trt:Configuration\n" +
                "                    token=\"VideoEncoderConfiguration1\">" +
                "                    <tt:Name>" +
                "                        VideoEncoderConfiguration1" +
                "                        </tt:Name>" +
                "                    <tt:UseCount>" +
                "                        1" +
                "                        </tt:UseCount>" +
                "                    <tt:Encoding>" +
                "                        H264" +
                "                        </tt:Encoding>" +
                "                    <tt:Resolution>" +
                "                        <tt:Width>" +
                "                            320" +
                "                            </tt:Width>" +
                "                        <tt:Height>" +
                "                            240" +
                "                            </tt:Height>" +
                "                        </tt:Resolution>" +
                "                    <tt:Quality>" +
                "                        5" +
                "                        </tt:Quality>" +
                "                    <tt:RateControl>" +
                "                        <tt:FrameRateLimit>" +
                "                            20" +
                "                            </tt:FrameRateLimit>" +
                "                        <tt:EncodingInterval>" +
                "                            1" +
                "                            </tt:EncodingInterval>" +
                "                        <tt:BitrateLimit>" +
                "                            4608" +
                "                            </tt:BitrateLimit>" +
                "                        </tt:RateControl>" +
                "                    <tt:H264>" +
                "                        <tt:GovLength>" +
                "                            75" +
                "                            </tt:GovLength>" +
                "                        <tt:H264Profile>" +
                "                            Main" +
                "                            </tt:H264Profile>" +
                "                        </tt:H264>" +
                "                    <tt:Multicast>" +
                "                        <tt:Address>" +
                "                            <tt:Type>" +
                "                                IPv4" +
                "                                </tt:Type>" +
                "                            </tt:Address>" +
                "                        <tt:Port>" +
                "                            0" +
                "                            </tt:Port>" +
                "                        <tt:TTL>" +
                "                            0" +
                "                            </tt:TTL>" +
                "                        <tt:AutoStart>" +
                "                            false" +
                "                            </tt:AutoStart>" +
                "                        </tt:Multicast>" +
                "                    <tt:SessionTimeout>" +
                "                        PT30M" +
                "                        </tt:SessionTimeout>" +
                "                    </trt:Configuration>" +
                "                </trt:GetVideoEncoderConfigurationResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetAudioEncoderConfigurationOptions(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetAudioEncoderConfigurationOptionsResponse>" +
                "                <trt:Options>" +
                "                    <tt:Options>" +
                "                        <tt:Encoding>" +
                "                            G726" +
                "                            </tt:Encoding>" +
                "                        <tt:BitrateList>" +
                "                            <tt:Items>" +
                "                                16" +
                "                                </tt:Items>" +
                "                            </tt:BitrateList>" +
                "                        <tt:SampleRateList>" +
                "                            <tt:Items>" +
                "                                8" +
                "                                </tt:Items>" +
                "                            <tt:Items>" +
                "                                32" +
                "                                </tt:Items>" +
                "                            </tt:SampleRateList>" +
                "                        </tt:Options>" +
//                "                    <tt:Options>" +
//                "                        <tt:Encoding>" +
//                "                            G711" +
//                "                            </tt:Encoding>" +
//                "                        <tt:BitrateList>" +
//                "                            <tt:Items>" +
//                "                                16" +
//                "                                </tt:Items>" +
//                "                            </tt:BitrateList>" +
//                "                        <tt:SampleRateList>" +
//                "                            <tt:Items>" +
//                "                                8" +
//                "                                </tt:Items>" +
//                "                            <tt:Items>" +
//                "                                32" +
//                "                                </tt:Items>" +
//                "                            </tt:SampleRateList>" +
//                "                        </tt:Options>" +
                "                    </trt:Options>" +
                "                </trt:GetAudioEncoderConfigurationOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }
    public StringBuilder GetAudioEncoderConfigurationOptions1(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetAudioEncoderConfigurationOptionsResponse>" +
                "                <trt:Options>" +
                "                    <tt:Options>" +
                "                        <tt:Encoding>" +
                "                            G726" +
                "                            </tt:Encoding>" +
                "                        <tt:BitrateList>" +
                "                            <tt:Items>" +
                "                                16" +
                "                                </tt:Items>" +
                "                            </tt:BitrateList>" +
                "                        <tt:SampleRateList>" +
                "                            <tt:Items>" +
                "                                8" +
                "                                </tt:Items>" +
                "                            <tt:Items>" +
                "                                32" +
                "                                </tt:Items>" +
                "                            </tt:SampleRateList>" +
                "                        </tt:Options>" +
                "                    </trt:Options>" +
                "                </trt:GetAudioEncoderConfigurationOptionsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetAudioEncoderConfiguration(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetAudioEncoderConfigurationResponse>" +
                "                <trt:Configuration\n" +
                "                    token=\"AudioEncoderConfiguration1\">" +
                "                    <tt:Name>" +
                "                        AudioEncoderConfiguration1" +
                "                        </tt:Name>" +
                "                    <tt:UseCount>" +
                "                        2" +
                "                        </tt:UseCount>" +
                "                    <tt:Encoding>" +
                "                        G711" +
                "                        </tt:Encoding>" +
                "                    <tt:Bitrate>" +
                "                        16" +
                "                        </tt:Bitrate>" +
                "                    <tt:SampleRate>" +
                "                        8" +
                "                        </tt:SampleRate>" +
                "                    <tt:Multicast>" +
                "                        <tt:Address>" +
                "                            <tt:Type>" +
                "                                IPv4" +
                "                                </tt:Type>" +
                "                            </tt:Address>" +
                "                        <tt:Port>" +
                "                            0" +
                "                            </tt:Port>" +
                "                        <tt:TTL>" +
                "                            0" +
                "                            </tt:TTL>" +
                "                        <tt:AutoStart>" +
                "                            false" +
                "                            </tt:AutoStart>" +
                "                        </tt:Multicast>" +
                "                    <tt:SessionTimeout>" +
                "                        PT30M" +
                "                        </tt:SessionTimeout>" +
                "                    </trt:Configuration>" +
                "                </trt:GetAudioEncoderConfigurationResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetStreamUri(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetStreamUriResponse>" +
                "                <trt:MediaUri>" +
                "                    <tt:Uri>" +
                "                        rtsp://192.168.10.175:8086/av0_0" +
                "                        </tt:Uri>" +
                "                    <tt:InvalidAfterConnect>" +
                "                        false" +
                "                        </tt:InvalidAfterConnect>" +
                "                    <tt:InvalidAfterReboot>" +
                "                        false" +
                "                        </tt:InvalidAfterReboot>" +
                "                    <tt:Timeout>" +
                "                        PT60S" +
                "                        </tt:Timeout>" +
                "                    </trt:MediaUri>" +
                "                </trt:GetStreamUriResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetAnalyticsModules(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tan:GetAnalyticsModulesResponse>" +
                "                <tan:AnalyticsModule\n" +
                "                    Name=\"MyCellMotionModule\"\n" +
                "                    Type=\"tt:CellMotionEngine\">" +
                "                    <tt:Parameters>" +
                "                        <tt:SimpleItem\n" +
                "                            Value=\"100\"\n" +
                "                            Name=\"Sensitivity\">" +
                "                            </tt:SimpleItem>" +
                "                        <tt:ElementItem\n" +
                "                            Name=\"Layout\">" +
                "                            <tt:CellLayout\n" +
                "                                Columns=\"22\"\n" +
                "                                Rows=\"18\">" +
                "                                <tt:Transformation>" +
                "                                    <tt:Translate\n" +
                "                                        x=\"-1.000000\"\n" +
                "                                        y=\"-1.000000\"/>" +
                "                                    <tt:Scale\n" +
                "                                        x=\"0.001042\"\n" +
                "                                        y=\"0.001852\"/>" +
                "                                    </tt:Transformation>" +
                "                                </tt:CellLayout>" +
                "                            </tt:ElementItem>" +
                "                        </tt:Parameters>" +
                "                    </tan:AnalyticsModule>" +
                "                <tan:AnalyticsModule\n" +
                "                    Name=\"MyTamperDetecModule\"\n" +
                "                    Type=\"tt:TamperEngine\">" +
                "                    <tt:Parameters>" +
                "                        <tt:SimpleItem\n" +
                "                            Value=\"0\"\n" +
                "                            Name=\"Sensitivity\">" +
                "                            </tt:SimpleItem>" +
                "                        <tt:ElementItem\n" +
                "                            Name=\"Transform\">" +
                "                            <tt:Transformation>" +
                "                                <tt:Translate\n" +
                "                                    x=\"-1.000000\"\n" +
                "                                    y=\"1.000000\"/>" +
                "                                <tt:Scale\n" +
                "                                    x=\"0.002841\"\n" +
                "                                    y=\"-0.003472\"/>" +
                "                                </tt:Transformation>" +
                "                            </tt:ElementItem>" +
                "                        <tt:ElementItem\n" +
                "                            Name=\"Field\">" +
                "                            <tt:PolygonConfiguration>" +
                "                                <tt:Polygon>" +
                "                                    <tt:Point\n" +
                "                                        x=\"0\"\n" +
                "                                        y=\"0\"/>" +
                "                                    <tt:Point\n" +
                "                                        x=\"704\"\n" +
                "                                        y=\"0\"/>" +
                "                                    <tt:Point\n" +
                "                                        x=\"704\"\n" +
                "                                        y=\"576\"/>" +
                "                                    <tt:Point\n" +
                "                                        x=\"0\"\n" +
                "                                        y=\"576\"/>" +
                "                                    </tt:Polygon>" +
                "                                </tt:PolygonConfiguration>" +
                "                            </tt:ElementItem>" +
                "                        </tt:Parameters>" +
                "                    </tan:AnalyticsModule>" +
                "                </tan:GetAnalyticsModulesResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetRules(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tan:GetRulesResponse>" +
                "                <tan:Rule\n" +
                "                    Name=\"MyMotionDetectorRule\"\n" +
                "                    Type=\"tt:CellMotionDetector\">" +
                "                    <tt:Parameters>" +
                "                        <tt:SimpleItem\n" +
                "                            Value=\"5\"\n" +
                "                            Name=\"MinCount\">" +
                "                            </tt:SimpleItem>" +
                "                        <tt:SimpleItem\n" +
                "                            Value=\"1000\"\n" +
                "                            Name=\"AlarmOnDelay\">" +
                "                            </tt:SimpleItem>" +
                "                        <tt:SimpleItem\n" +
                "                            Value=\"1000\"\n" +
                "                            Name=\"AlarmOffDelay\">" +
                "                            </tt:SimpleItem>" +
                "                        <tt:SimpleItem\n" +
                "                            Value=\"0P8A8A==\"\n" +
                "                            Name=\"ActiveCells\">" +
                "                            </tt:SimpleItem>" +
                "                        </tt:Parameters>" +
                "                    </tan:Rule>" +
                "                </tan:GetRulesResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetOSDs(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <trt:GetOSDsResponse>" +
                "                <trt:OSDs\n" +
                "                    token=\"VideoOsd0\">" +
                "                    <tt:VideoSourceConfigurationToken>" +
                "                        VideoSourceConfiguration" +
                "                        </tt:VideoSourceConfigurationToken>" +
                "                    <tt:Type>" +
                "                        Text" +
                "                        </tt:Type>" +
                "                    <tt:Position>" +
                "                        <tt:Type>" +
                "                            Custom" +
                "                            </tt:Type>" +
                "                        <tt:Pos\n" +
                "                            y=\"1\"\n" +
                "                            x=\"-1\">" +
                "                            </tt:Pos>" +
                "                        </tt:Position>" +
                "                    <tt:TextString>" +
                "                        <tt:Type>" +
                "                            DateAndTime" +
                "                            </tt:Type>" +
                "                        <tt:DateFormat>" +
                "                            yyyy-MM-dd" +
                "                            </tt:DateFormat>" +
                "                        <tt:TimeFormat>" +
                "                            HH:mm:ss" +
                "                            </tt:TimeFormat>" +
                "                        </tt:TextString>" +
                "                    </trt:OSDs>" +
                "                <trt:OSDs\n" +
                "                    token=\"VideoOsd1\">" +
                "                    <tt:VideoSourceConfigurationToken>" +
                "                        VideoSourceConfiguration1" +
                "                        </tt:VideoSourceConfigurationToken>" +
                "                    <tt:Type>" +
                "                        Text" +
                "                        </tt:Type>" +
                "                    <tt:Position>" +
                "                        <tt:Type>" +
                "                            Custom" +
                "                            </tt:Type>" +
                "                        <tt:Pos\n" +
                "                            y=\"1\"\n" +
                "                            x=\"-1\">" +
                "                            </tt:Pos>" +
                "                        </tt:Position>" +
                "                    <tt:TextString>" +
                "                        <tt:Type>" +
                "                            Plain" +
                "                            </tt:Type>" +
                "                        <tt:PlainText>" +
                "                            IPC717330" +
                "                            </tt:PlainText>" +
                "                        </tt:TextString>" +
                "                    </trt:OSDs>" +
                "                </trt:GetOSDsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder GetImagingSettings(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <timg:GetImagingSettingsResponse>" +
                "                <timg:ImagingSettings>" +
                "                    <tt:BacklightCompensation>" +
                "                        <tt:Mode>" +
                "                            OFF" +
                "                            </tt:Mode>" +
                "                        <tt:Level>" +
                "                            0" +
                "                            </tt:Level>" +
                "                        </tt:BacklightCompensation>" +
                "                    <tt:Brightness>" +
                "                        129" +
                "                        </tt:Brightness>" +
                "                    <tt:ColorSaturation>" +
                "                        162" +
                "                        </tt:ColorSaturation>" +
                "                    <tt:Contrast>" +
                "                        129" +
                "                        </tt:Contrast>" +
                "                    <tt:Exposure>" +
                "                        <tt:Mode>" +
                "                            AUTO" +
                "                            </tt:Mode>" +
                "                        <tt:Priority>" +
                "                            LowNoise" +
                "                            </tt:Priority>" +
                "                        <tt:Window\n" +
                "                            left=\"0\"\n" +
                "                            right=\"0\"\n" +
                "                            top=\"0\"\n" +
                "                            bottom=\"0\">" +
                "                            </tt:Window>" +
                "                        <tt:MinExposureTime>" +
                "                            1" +
                "                            </tt:MinExposureTime>" +
                "                        <tt:MaxExposureTime>" +
                "                            30000" +
                "                            </tt:MaxExposureTime>" +
                "                        <tt:MinGain>" +
                "                            0" +
                "                            </tt:MinGain>" +
                "                        <tt:MaxGain>" +
                "                            255" +
                "                            </tt:MaxGain>" +
                "                        <tt:MinIris>" +
                "                            0" +
                "                            </tt:MinIris>" +
                "                        <tt:MaxIris>" +
                "                            255" +
                "                            </tt:MaxIris>" +
                "                        <tt:ExposureTime>" +
                "                            15" +
                "                            </tt:ExposureTime>" +
                "                        <tt:Gain>" +
                "                            255" +
                "                            </tt:Gain>" +
                "                        <tt:Iris>" +
                "                            3" +
                "                            </tt:Iris>" +
                "                        </tt:Exposure>" +
                "                    <tt:Focus>" +
                "                        <tt:AutoFocusMode>" +
                "                            AUTO" +
                "                            </tt:AutoFocusMode>" +
                "                        <tt:DefaultSpeed>" +
                "                            5" +
                "                            </tt:DefaultSpeed>" +
                "                        <tt:NearLimit>" +
                "                            0" +
                "                            </tt:NearLimit>" +
                "                        <tt:FarLimit>" +
                "                            0" +
                "                            </tt:FarLimit>" +
                "                        </tt:Focus>" +
                "                    <tt:IrCutFilter>" +
                "                        AUTO" +
                "                        </tt:IrCutFilter>" +
                "                    <tt:Sharpness>" +
                "                        128" +
                "                        </tt:Sharpness>" +
                "                    <tt:WideDynamicRange>" +
                "                        <tt:Mode>" +
                "                            OFF" +
                "                            </tt:Mode>" +
                "                        <tt:Level>" +
                "                            1" +
                "                            </tt:Level>" +
                "                        </tt:WideDynamicRange>" +
                "                    <tt:WhiteBalance>" +
                "                        <tt:Mode>" +
                "                            AUTO" +
                "                            </tt:Mode>" +
                "                        <tt:CrGain>" +
                "                            128" +
                "                            </tt:CrGain>" +
                "                        <tt:CbGain>" +
                "                            128" +
                "                            </tt:CbGain>" +
                "                        </tt:WhiteBalance>" +
                "                    </timg:ImagingSettings>" +
                "                </timg:GetImagingSettingsResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder Subscribe(String subStr){
        Date date = new Date();
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "<wsnt:SubscribeResponse>" +
                "<wsnt:SubscriptionReference>" +
                "<wsa5:Address>" +
                "http://192.168.10.175:2000/onvif/device_service" +
                "</wsa5:Address>" +
                "</wsnt:SubscriptionReference>" +
                "<wsnt:CurrentTime>" +
                date +
                "</wsnt:CurrentTime>" +
                "<wsnt:TerminationTime>" +
                date +
                "</wsnt:TerminationTime>" +
                "</wsnt:SubscribeResponse>" +
                "</SOAP-ENV:Body>" +
                "</SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder Renew(String subStr){
        Date date = new Date();
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <wsnt:RenewResponse>" +
                "                <wsnt:TerminationTime>" +
                date +
//                "                    2020-03-04T09:40:32Z" +
                "                    </wsnt:TerminationTime>" +
                "                <wsnt:CurrentTime>" + date +
//                "                    2020-03-04T09:39:32Z" +
                "                    </wsnt:CurrentTime>" +
                "                </wsnt:RenewResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

    public StringBuilder SetSynchronizationPoint(String subStr){
        StringBuilder buffer = getStringBuilder();
//        buffer.append(subStr);
        buffer.append("<SOAP-ENV:Body>" +
                "            <tev:SetSynchronizationPointResponse>" +
                "                </tev:SetSynchronizationPointResponse>" +
                "            </SOAP-ENV:Body>" +
                "        </SOAP-ENV:Envelope>");
        return buffer;
    }

}
