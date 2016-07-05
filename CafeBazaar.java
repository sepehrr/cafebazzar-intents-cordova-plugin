/**
 * The MIT License
 *
 *	Copyright (c) 2016
 *	Sepehr Raftari (https://github.com/sepehrr)
 *	
 *	
 *	Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *	
 *	The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *	
 *	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 */
package com.epsi.plugins.cordova;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.json.JSONArray;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import android.util.Log;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;


public class CafeBazaar extends CordovaPlugin {
    private static final String LOG_TAG = CafeBazaar.class.getSimpleName();
    private static int REQUEST_CODE = 1001;

    //@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {

        if (action.equals("display-app")) {
            try {
                JSONObject arg_object = args.getJSONObject(0);
                String app = arg_object.getString("app");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("bazaar://details?id=" + app));
                intent.setPackage("com.farsitel.bazaar");
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("success");
                return true;
            } catch(Exception e) {
                System.err.println("Exception: " + e.getMessage());
                callbackContext.error(e.getMessage());
                return false;
            } 
        }
    	
       if (action.equals("rate-app")) {
            try {
                JSONObject arg_object = args.getJSONObject(0);
                String app = arg_object.getString("app");
                Intent intent = new Intent(Intent.ACTION_EDIT); 
                intent.setData(Uri.parse("bazaar://details?id=" + app));
                intent.setPackage("com.farsitel.bazaar");
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("success");
                return true;
            } catch(Exception e) {
                System.err.println("Exception: " + e.getMessage());
                callbackContext.error(e.getMessage());
                return false;
            } 
        }

        if (action.equals("disp-developer")) {
            try {
                JSONObject arg_object = args.getJSONObject(0);
                String developer = arg_object.getString("developer");
                Intent intent = new Intent(Intent.ACTION_VIEW); 
                intent.setData(Uri.parse("bazaar://collection?slug=by_author&aid=" + developer)); 
                intent.setPackage("com.farsitel.bazaar"); 
                this.cordova.getActivity().startActivity(intent);
                callbackContext.success("success");
                return true;
            } catch(Exception e) {
                System.err.println("Exception: " + e.getMessage());
                callbackContext.error(e.getMessage());
                return false;
            } 
        }

        //callbackContext.error("false command");
        return true;


    }


    
}
