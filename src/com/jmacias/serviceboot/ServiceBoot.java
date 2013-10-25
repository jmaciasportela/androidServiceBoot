package com.jmacias.serviceboot;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import android.os.Handler;

public class ServiceBoot extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	@Override
	public void onCreate() {
		super.onCreate();
		Log.d("SERVICEBOOT", "MACI - ARRANCANDO EL SERVICIO");		
		Toast.makeText(this, "Servicio creado", Toast.LENGTH_LONG).show();

	    final Handler h = new Handler();
	    h.postDelayed(new Runnable()
	    {
	        private long time = 0;

	        @Override
	        public void run()
	        {
	            // do stuff then
	            // can call h again after work!
	            time += 1000;
	            Log.d("SERVICEBOOT", "MACI - Going for... " + time);
	            h.postDelayed(this, 1000);
	        }
	    }, 1000); // 1 second delay (takes millis)
		
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		Toast.makeText(this, "Servicio destruido", Toast.LENGTH_LONG).show();
		Log.d("SERVICEBOOT", "Servicio destruido");
	}
}
