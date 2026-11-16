package io.p071bidmachine.media3.ui;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ecffri.arrows.R;
import io.p071bidmachine.media3.common.util.x;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class m extends RecyclerView.ViewHolder {
    public final TextView e;
    public final View f;

    public m(View view) {
        super(view);
        if (x.a < 26) {
            view.setFocusable(true);
        }
        this.e = (TextView) view.findViewById(R.id.exo_text);
        this.f = view.findViewById(R.id.exo_check);
    }
}
