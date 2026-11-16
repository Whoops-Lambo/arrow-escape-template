package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.og, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4909og {
    private NetworkSettings b;
    private ArrayList<String> a = new ArrayList<>();
    private JSONObject c = null;
    private boolean d = true;

    public JSONObject b() {
        return this.c;
    }

    @Nullable
    public NetworkSettings c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.a;
    }

    public boolean e() {
        return this.d;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a.add(str);
        }
    }

    public void a(NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public static C4909og a() {
        return new C4909og();
    }
}
