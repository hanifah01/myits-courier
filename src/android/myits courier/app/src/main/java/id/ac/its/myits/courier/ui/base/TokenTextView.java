package id.ac.its.myits.courier.ui.base;

import android.content.Context;
import android.util.AttributeSet;

import id.ac.its.myits.courier.R;
import id.ac.its.myits.courier.utils.AppLogger;


/**
 * Created by rizky on 13/08/2017.
 */

public class TokenTextView extends androidx.appcompat.widget.AppCompatTextView {

    public TokenTextView(Context context) {
        super(context);
    }

    public TokenTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        AppLogger.d("Contact Selected");
        setCompoundDrawablesWithIntrinsicBounds(0, 0, selected ? R.drawable.ic_close_black_20dp : 0, 0);

    }
}
