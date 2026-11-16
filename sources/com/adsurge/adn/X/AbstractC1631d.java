package com.adsurge.adn.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.ironsource.C4664b4;
import java.util.ArrayDeque;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.adsurge.adn.X.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC1631d {
    public static JSONObject a(View view) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        ArrayDeque arrayDeque = new ArrayDeque();
        if (view != null) {
            arrayDeque.add(view);
        }
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.remove();
            try {
                if (view2 instanceof TextView) {
                    CharSequence text = ((TextView) view2).getText();
                    if (!TextUtils.isEmpty(text)) {
                        jSONArray.put(new com.adsurge.adn.I0.e().a("text", (Object) text.toString()).a("editable", view2 instanceof EditText).a());
                    }
                } else if (view2 instanceof WebView) {
                    String url = ((WebView) view2).getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        jSONArray2.put(new com.adsurge.adn.I0.e().a("url", (Object) url).a());
                    }
                } else if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            arrayDeque.add(childAt);
                        }
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
        return new com.adsurge.adn.I0.e().a("textview", jSONArray).a(C4664b4.i.K, jSONArray2).a();
    }
}
