package com.jmacias.serviceboot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class ReceiverBoot extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("SERVICEBOOT", "MACI - RECEIVERBOOT - ONRECEIVE");
		// LANZAR SERVICIO
		Intent serviceIntent = new Intent();
		serviceIntent.setAction("com.jmacias.serviceboot.ServiceBoot");
		context.startService(serviceIntent);

		// LANZAR ACTIVIDAD		
		Intent i = new Intent(context, MainActivity.class);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(i);
	}
}
