package com.swx.myapplication;

import android.content.Context;
import android.util.Log;

import com.swx.myapplication.nanohttpd.protocols.http.IHTTPSession;
import com.swx.myapplication.nanohttpd.protocols.http.NanoHTTPD;
import com.swx.myapplication.nanohttpd.protocols.http.response.Response;
import com.swx.myapplication.nanohttpd.protocols.http.response.Status;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 * Created by Android Studio.
 * User: 身为行
 * Date: 2020/2/28
 * Time: 14:37
 * Describe: ${as}
 */
public class StartServer extends NanoHTTPD {

    public StartServer() {
        super(2000);
    }

    @Override
    public Response serve(IHTTPSession session){

        try {
            HashMap<String, String> map = new HashMap<>();
            session.parseBody(map);
            String recvData = map.get("postData");
//                switch (reveStr) {
//                    case "<tds:GetSystemDateAndTime/>":
//                        StringBuilder systemDateAndTimebuffer = RespeonXml.getInstance().GetSystemDateAndTime();
//                        String systemDateAndTime = systemDateAndTimebuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", systemDateAndTime);
//
//                    case "<tds:SetSystemDateAndTime>":
//                        StringBuilder buffer = RespeonXml.getInstance().getStringBuilder();
//                        buffer.append("<SOAP-ENV:Body> \r\n");
//                        buffer.append("<tds:SetSystemDateAndTimeResponse/> \r\n");
//                        buffer.append("</SOAP-ENV:Body> \r\n");
//                        buffer.append("</SOAP-ENV:Envelope>");
//                        String str = buffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);
//
//                    case "<tds:GetCapabilities>":
//                        StringBuilder capabilitiesbuffer = RespeonXml.getInstance().GetCapabilities(subStr);
//                        String capabilities = capabilitiesbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", capabilities);
//
//                    case "<trt:GetProfiles/>":
//                        StringBuilder profilesbuffer = RespeonXml.getInstance().GetProfiles(subStr);
//                        String profiles = profilesbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", profiles);
//
//                    case "<trt:GetVideoAnalyticsConfigurations/>":
//                        StringBuilder videoAnalyticsConfigurationsbuffer = RespeonXml.getInstance().GetVideoAnalyticsConfigurations(subStr);
//                        String videoAnalyticsConfigurations = videoAnalyticsConfigurationsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", videoAnalyticsConfigurations);
//
//                    case "<tds:GetNetworkInterfaces/>":
//                        StringBuilder strbuffer = RespeonXml.getInstance().getStringBuilder();
//                        strbuffer.append("<SOAP-ENV:Body> \r\n");
//                        strbuffer.append("<tds:GetNetworkInterfacesResponse/> \r\n");
//                        strbuffer.append("</SOAP-ENV:Body> \r\n");
//                        strbuffer.append("</SOAP-ENV:Envelope>");
//                        String networkInterfaces = strbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", networkInterfaces);
//
//                    case "<tds:GetDeviceInformation/>":
//                        StringBuilder deviceInformationbuffer = RespeonXml.getInstance().GetDeviceInformation(subStr);
////                Log.i("aaa",buffer.toString());
//                        String deviceInformation = deviceInformationbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", deviceInformation);
//
//                    case "<timg:GetOptions>":
//                        StringBuilder optionsbuffer = RespeonXml.getInstance().GetOptions(subStr);
////                Log.i("aaa",buffer.toString());
//                        String options = optionsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", options);
//
//                    case "<timg:GetMoveOptions>":
//                        StringBuilder moveOptionsbuffer = RespeonXml.getInstance().GetMoveOptions(subStr);
////                Log.i("aaa",buffer.toString());
//                        String moveOptions = moveOptionsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", moveOptions);
//
//                    case "<tptz:GetConfigurationOptions>":
//                        StringBuilder configurationOptionsbuffer = RespeonXml.getInstance().GetConfigurationOptions(subStr);
//                        String configurationOptions = configurationOptionsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", configurationOptions);
//
//                    case "<tptz:GetPresets>":
//                        StringBuilder presetsbuffer = RespeonXml.getInstance().GetPresets(subStr);
//                        String presets = presetsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", presets);
//
//                    case "<trt:GetOSDOptions>":
//                        StringBuilder osdOptionsbuffer = RespeonXml.getInstance().GetOSDOptions(subStr);
//                        String osdOptions = osdOptionsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", osdOptions);
//
//                    case "<trt:GetVideoEncoderConfigurationOptions>":
//                        StringBuilder videoEncoderConfigurationOptionsbuffer = RespeonXml.getInstance().GetVideoEncoderConfigurationOptions(subStr);
//                        String videoEncoderConfigurationOptions = videoEncoderConfigurationOptionsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", videoEncoderConfigurationOptions);
//
//                    case "<trt:GetVideoEncoderConfiguration>":
//                        StringBuilder videoEncoderConfigurationbuffer = RespeonXml.getInstance().GetVideoEncoderConfiguration(subStr);
//                        String videoEncoderConfiguration = videoEncoderConfigurationbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", videoEncoderConfiguration);
//
//                    case "<trt:GetStreamUri>":
//                        StringBuilder streamUribuffer = RespeonXml.getInstance().GetStreamUri(subStr);
//                        String streamUri = streamUribuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", streamUri);
//
//                    case "<wsnt:Subscribe>":
//                        StringBuilder subscribebuffer = RespeonXml.getInstance().Subscribe(subStr);
//                        String subscribe = subscribebuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", subscribe);
//
//                    case "<trt:GetAudioEncoderConfigurationOptions>":
//                        StringBuilder audioEncoderConfigurationOptionsbuffer = RespeonXml.getInstance().GetAudioEncoderConfigurationOptions(subStr);
//                        String audioEncoderConfigurationOptions = audioEncoderConfigurationOptionsbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", audioEncoderConfigurationOptions);
//
//                    case "GetAudioEncoderConfiguration":
//                        StringBuilder audioEncoderConfigurationbuffer = RespeonXml.getInstance().GetAudioEncoderConfiguration(subStr);
//                        String audioEncoderConfiguration = audioEncoderConfigurationbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", audioEncoderConfiguration);
//
//                    case "<tptz:GetPresetTours>":
//                        StringBuilder presetToursbuffer = RespeonXml.getInstance().GetPresetTours(subStr);
//                        String presetTours = presetToursbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", presetTours);
//
//                    case "<tptz:CreatePresetTour>":
//                        StringBuilder createPresetTourbuffer = RespeonXml.getInstance().CreatePresetTour(subStr);
//                        String createPresetTour = createPresetTourbuffer.toString().replaceAll(" ", "");
//                        return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", createPresetTour);
//
//
//                }
            return getStructure(recvData);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ResponseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Response getStructure(String reveStr) {
        if (!reveStr.equals("")) {
//            Log.i("aaa","接收的："+reveStr);
            int start = reveStr.indexOf("<soap:Header>");
            int end = reveStr.indexOf("<soap:Body>");
            String subStr = null;
            if (start != -1) {
                int start2 = reveStr.indexOf("<wsse:Nonce");
                int end2 = reveStr.indexOf("</wsse:Nonce>");
                String substring = reveStr.substring(start2, end2);
                String substring1 = substring.substring(substring.indexOf(">"));

                String before = reveStr.substring(start, start2 + 11);
                String later = reveStr.substring(end2, end);

                subStr = before + substring1 + later;

//                Log.i("aaa","before："+before);
//                Log.i("aaa","later："+later);
//                Log.i("aaa","substring1："+substring1);
//                Log.i("aaa","截取的header："+subStr);
            }

            if (reveStr.contains("<tds:GetSystemDateAndTime/>")) {
                Log.i("aaa","1-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetSystemDateAndTime();
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tds:SetSystemDateAndTime>")){
                Log.i("aaa","2-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().getStringBuilder();
//                buffer.append(subStr);
//                String envelope = reveStr.substring(reveStr.indexOf("<soap:Body>"));
//                buffer.append(envelope);
                buffer.append("<SOAP-ENV:Body> \r\n");
                buffer.append("<tds:SetSystemDateAndTimeResponse/> \r\n");
                buffer.append("</SOAP-ENV:Body> \r\n");
                buffer.append("</SOAP-ENV:Envelope>");
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tds:GetCapabilities>")) {
                Log.i("aaa","3-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetCapabilities(subStr);
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetProfiles/>")){
                Log.i("aaa","4-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetProfiles(subStr);
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetVideoAnalyticsConfigurations/>")){
                Log.i("aaa","5-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetVideoAnalyticsConfigurations(subStr);
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            } else if (reveStr.contains("<tds:GetNetworkInterfaces/>")){
                Log.i("aaa","6-------------------->");
//                StringBuilder buffer = RespeonXml.getInstance().GetNetworkInterfaces(subStr);
                StringBuilder buffer = RespeonXml.getInstance().getStringBuilder();
                buffer.append("<SOAP-ENV:Body> \r\n");
                buffer.append("<tds:GetNetworkInterfacesResponse/> \r\n");
                buffer.append("</SOAP-ENV:Body> \r\n");
                buffer.append("</SOAP-ENV:Envelope>");
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tds:GetDeviceInformation/>")){
                Log.i("aaa","7-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetDeviceInformation(subStr);
//                Log.i("aaa",buffer.toString());
//                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", buffer.toString());

            }else if (reveStr.contains("<timg:GetOptions>")){
                Log.i("aaa","8-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetOptions(subStr);
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<timg:GetMoveOptions>")){
                Log.i("aaa","9-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetMoveOptions(subStr);
//                Log.i("aaa",buffer.toString());
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tptz:GetConfigurationOptions>")){
                Log.i("aaa","10-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetConfigurationOptions(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            } else if (reveStr.contains("<tptz:GetPresets>")){
                Log.i("aaa","11-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetPresets(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetOSDOptions>")){
                Log.i("aaa","12-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetOSDOptions(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetVideoEncoderConfigurationOptions>")){
                Log.i("aaa","13-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetVideoEncoderConfigurationOptions(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetVideoEncoderConfiguration>")){
                Log.i("aaa","14-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetVideoEncoderConfiguration(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetStreamUri>")){
                Log.i("aaa","15-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetStreamUri(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<wsnt:Subscribe>")){
                Log.i("aaa","16-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().Subscribe(subStr);
//                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", buffer.toString());

            }else if (reveStr.contains("<trt:GetAudioEncoderConfigurationOptions>")){
                Log.i("aaa","17-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetAudioEncoderConfigurationOptions(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("GetAudioEncoderConfiguration")){
                Log.i("aaa","18-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetAudioEncoderConfiguration(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tptz:GetPresetTours>")){
                Log.i("aaa","19-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetPresetTours(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tptz:CreatePresetTour>")){
                Log.i("aaa","20-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().CreatePresetTour(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tan:GetAnalyticsModules>")){
                Log.i("aaa","21-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetAnalyticsModules(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tan:GetRules>")){
                Log.i("aaa","22-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetRules(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<trt:GetOSDs>")){
                Log.i("aaa","23-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetOSDs(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<timg:GetImagingSettings>")){
                Log.i("aaa","24-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().GetImagingSettings(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<wsnt:Renew>")){
                Log.i("aaa","25-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().Renew(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<tev:SetSynchronizationPoint/>")){
                Log.i("aaa","26-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().SetSynchronizationPoint(subStr);
                String str = buffer.toString().replaceAll(" ","");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

//            }else if (reveStr.contains("GetConfigurations")){
//                Log.i("aaa","27-------------------->");
//                StringBuilder buffer = RespeonXml.getInstance().getStringBuilder();
//                buffer.append("<SOAP-ENV:Body> \r\n");
//                buffer.append("<tptz:GetConfigurationsResponse/> \r\n");
//                buffer.append("</SOAP-ENV:Body> \r\n");
//                buffer.append("</SOAP-ENV:Envelope>");
////                Log.i("aaa",buffer.toString());
//                String str = buffer.toString().replaceAll(" ","");
//                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", str);

            }else if (reveStr.contains("<wsnt:Unsubscribe/>")){
                Log.i("aaa","27-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().getStringBuilder();
                buffer.append("<SOAP-ENV:Body>");
                buffer.append("<wsnt:UnsubscribeResponse/>");
                buffer.append("</SOAP-ENV:Body>");
                buffer.append("</SOAP-ENV:Envelope> ");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", buffer.toString());

            }else if (reveStr.contains("<trt:SetVideoEncoderConfiguration>")){
                Log.i("aaa","28-------------------->");
                StringBuilder buffer = RespeonXml.getInstance().getStringBuilder();
                buffer.append("<SOAP-ENV:Body>");
                buffer.append("<trt:SetVideoEncoderConfigurationResponse/>");
                buffer.append("</SOAP-ENV:Body>");
                buffer.append("</SOAP-ENV:Envelope> ");
                return Response.newFixedLengthResponse(Status.OK, "application/soap+xml; charset=utf-8", buffer.toString());

            }
            else{
                Log.i("aaa","29-------------------->");
                return Response.newFixedLengthResponse("123");
            }
        }
        else {
            return Response.newFixedLengthResponse(Status.BAD_REQUEST, "application/soap+xml; charset=utf-8", "没有收到消息");
        }

    }

    private void saveDataToFile(StartServer context, String data) {
        String path = "/sdcard/onvif.txt";

        FileOutputStream fileOutputStream = null;
        BufferedWriter bufferedWriter = null;
        try
        {
            /**
             * "data"为文件名,MODE_PRIVATE表示如果存在同名文件则覆盖，
             * 还有一个MODE_APPEND表示如果存在同名文件则会往里面追加内容
             */
            fileOutputStream = App.getContext().openFileOutput(path,
                    Context.MODE_PRIVATE);
            bufferedWriter = new BufferedWriter(
                    new OutputStreamWriter(fileOutputStream));
            bufferedWriter.write(data);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            try
            {
                if (bufferedWriter != null)
                {
                    bufferedWriter.close();
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}
