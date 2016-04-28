package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;

import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

/**
 * Created by root on 28/4/16.
 */
//https://discussions.udacity.com/t/async-task-test-where-to-even-begin/159593/4
public class AsyncTaskTest extends AndroidTestCase{
    MainActivity.EndpointsAsyncTask task;
    String result;
    @Mock Context mContext;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        result=null;
        task = new MainActivity().new EndpointsAsyncTask(){
            @Override
            protected void onPostExecute(String result) {

            }
        };
    }

    public void testStringLength(){
        try{
            task.execute(mContext);
            result = task.get(20, TimeUnit.SECONDS);
            assertNotNull(result);
        } catch (Exception e){
            fail("Timed out");
        }
    }
}
