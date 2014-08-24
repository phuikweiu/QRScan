package com.zijunlin.Zxing.Demo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

public class FetchDB
{
	private static String LOG_TAG = "FetchDB";
	public static String getStringfromURL(String url) 
	{
		InputStream is = null;
		String result = "";
		
		// Download JSON data from URL
		try 
		{
			HttpClient httpclient = new DefaultHttpClient();
		    HttpPost httppost = new HttpPost(url);
		    HttpResponse response = httpclient.execute(httppost);
		    HttpEntity entity = response.getEntity();
		    is = entity.getContent();
		    } 
		catch (Exception e) 
		{
		    Log.e(LOG_TAG, "Error in http connection " + e.toString());
		    }

		// Convert response to string
		try
		{
		    BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
		    StringBuilder sb = new StringBuilder();
		    String line = null;
		    while ((line = reader.readLine()) != null) 
		    {
		    	sb.append(line + "\n");
		        }
		    is.close();
		    result = sb.toString();
		    } 
		catch (Exception e) 
		{
		    Log.e(LOG_TAG, "Error converting result " + e.toString());
		    }
	    return result;
	}
}
