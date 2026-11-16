package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pf0 extends RelativeLayout {
    public final Button a;
    public final EditText b;
    public final Rect c;
    public final Rect d;

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    public pf0(Context context, EditText editText) {
        super(context);
        this.b = editText;
        Rect rect = new Rect(16, 16, 16, 16);
        this.c = rect;
        this.d = new Rect(0, 0, 0, 0);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Button button = new Button(context);
        this.a = button;
        button.setId(View.generateViewId());
        this.a.setText(context.getResources().getIdentifier("ok", "string", "android"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        this.a.setLayoutParams(layoutParams);
        this.a.setBackgroundColor(0);
        addView(this.a);
        editText.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, this.a.getId());
        editText.setLayoutParams(layoutParams2);
        addView(editText);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        setBackgroundColor(-1);
    }
}
