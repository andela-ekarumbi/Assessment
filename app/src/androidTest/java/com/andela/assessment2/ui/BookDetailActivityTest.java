package com.andela.assessment2.ui;

import android.support.test.rule.ActivityTestRule;

import com.andela.assessment2.R;
import com.andela.assessment2.Util;
import com.andela.assessment2.model.Book;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by Eston on 13/01/2017.
 */
public class BookDetailActivityTest {

    @Rule
    public ActivityTestRule<BookDetailActivity> testRule
             = new ActivityTestRule<>(BookDetailActivity.class);

    @Test
    public void testBookDetailsDisplayed() throws Exception {
        Book book = Util.getTestBook();
        onView(withId(R.id.book_title))
                .check(matches(withText(book.getTitle())));
        onView(withId(R.id.book_author))
                .check(matches(withText(book.getAuthor())));
        onView(withId(R.id.book_description))
                .check(matches(withText(book.getDescription())));
    }

}