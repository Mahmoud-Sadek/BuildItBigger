package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void testDoInBackground() throws Exception{
        try {
            MainActivityFragment mainActivity = new MainActivityFragment();
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mainActivity, InstrumentationRegistry.getTargetContext());
            endpointsAsyncTask.execute();
            String result = endpointsAsyncTask.get(30, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e){
            Log.e("EndpointsAsyncTaskTest", "testDoInBackground: Timed out");
        }
    }
}