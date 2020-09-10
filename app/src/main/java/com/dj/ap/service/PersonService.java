package com.dj.ap.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

import androidx.annotation.Nullable;

import com.dj.ap.aidl.IPerson;

public class PersonService extends Service {

    public PersonService(){

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new PersonBinder();
    }

    class PersonBinder extends IPerson.Stub{
        @Override
        public String getName() throws RemoteException {
            return "axiba";
        }
    }

}
