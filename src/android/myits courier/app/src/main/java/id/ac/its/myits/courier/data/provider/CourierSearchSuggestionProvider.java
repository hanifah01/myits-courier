package id.ac.its.myits.courier.data.provider;

import android.content.SearchRecentSuggestionsProvider;

public class CourierSearchSuggestionProvider extends
        SearchRecentSuggestionsProvider {
    public final static String AUTHORITY =
            CourierSearchSuggestionProvider.class.getName();

    public final static int MODE = DATABASE_MODE_QUERIES;

    public CourierSearchSuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}
