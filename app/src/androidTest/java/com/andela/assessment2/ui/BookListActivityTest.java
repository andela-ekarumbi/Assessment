package com.andela.assessment2.ui;

import android.app.Activity;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.andela.assessment2.R;
import com.andela.assessment2.RecyclerViewMatcher;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Eston on 13/01/2017.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest

public class BookListActivityTest {

    public ActivityTestRule<BookListActivity> testRule
            = new ActivityTestRule<>(BookListActivity.class);

    MockWebServer mockWebServer;

    @Before
    public void setUp() throws Exception {
        mockWebServer = new MockWebServer();
        mockWebServer.start();
        mockWebServer.enqueue(new MockResponse()
                .setResponseCode(200)
                .setBody(getTestJson()));
    }

    public static RecyclerViewMatcher withRecyclerView(final int recyclerViewId) {
        return new RecyclerViewMatcher(recyclerViewId);
    }

    @Test
    public void testBookListDisplayed() throws Exception {
        onView(withRecyclerView(R.id.recycler).atPosition(0))
                .check(matches(hasDescendant(withText("\"I GIVE YOU MY BODY ...\""))));
        onView(withRecyclerView(R.id.recycler).atPosition(1))
                .check(matches(hasDescendant(withText("\"MOST BLESSED OF THE PATRIARCHS\""))));
    }

    private String getTestJson() throws Exception {
        Context context = InstrumentationRegistry.getTargetContext();
        InputStream is = context.getAssets().open("test_list.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String textLine = bufferedReader.readLine();
        while (textLine != null) {
            builder.append(textLine);
            textLine = bufferedReader.readLine();
        }
        return builder.toString();
    }

}