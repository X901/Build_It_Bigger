
package com.udacity.gradle.builditbigger;

        import android.util.Log;

        import androidx.test.InstrumentationRegistry;
        import androidx.test.runner.AndroidJUnit4;

        import org.junit.Test;
        import org.junit.runner.RunWith;

        import static junit.framework.TestCase.assertNotNull;
        import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {

    @Test
    public void testDoInBackground()   {

        String response = null;

        try {
        com.udacity.gradle.builditbigger.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.MainActivityFragment();
        fragment.testFlag = true;
        new EndpointAsyncTask().execute(fragment);
        Thread.sleep(5000);
        assertTrue("Error: get Joke = " + fragment.loadedJoke, fragment.loadedJoke != null);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }




}

