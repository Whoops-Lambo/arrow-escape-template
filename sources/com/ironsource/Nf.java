package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Nf {

    @NotNull
    public static final Nf a = new Nf();

    private final void a(D5 d5, Integer num, String str) throws JSONException {
        Wf wf = Wf.a;
        JSONObject jSONObjectA = wf.a(false);
        if (num != null) {
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, num.intValue());
            JSONArray jSONArrayA = a();
            if (jSONArrayA != null) {
                jSONObjectA.put(com.ironsource.mediationsdk.metadata.a.f, jSONArrayA);
            }
        }
        if (str != null) {
            jSONObjectA.put("reason", str);
        }
        wf.a(d5, jSONObjectA);
    }

    public final void b() {
        a(this, D5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    public final void c() {
        a(this, D5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    public final void d() {
        a(this, D5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    private Nf() {
    }

    public final void a(@NotNull String str) {
        str.getClass();
        a(D5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), str);
    }

    public static /* synthetic */ void a(Nf nf, D5 d5, Integer num, String str, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        nf.a(d5, num, str);
    }

    public final void a(int i) {
        a(D5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    private final JSONArray a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapD = Wf.a.d();
        if (concurrentHashMapD.containsKey(com.ironsource.mediationsdk.metadata.a.f)) {
            return new JSONArray((Collection) concurrentHashMapD.get(com.ironsource.mediationsdk.metadata.a.f));
        }
        return null;
    }
}
