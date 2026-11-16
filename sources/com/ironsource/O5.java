package com.ironsource;

import android.util.Log;
import android.util.Pair;
import defpackage.h50;
import defpackage.q63;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class O5 {
    private static final String e = "EventsTracker";
    private InterfaceC4936q7 a;
    private I5 b;
    private J7 c;
    private ExecutorService d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Rd rd = new Rd();
                ArrayList<Pair<String, String>> arrayListD = O5.this.b.d();
                if ("POST".equals(O5.this.b.e())) {
                    rd = C4758g8.b(O5.this.b.b(), this.a, arrayListD);
                } else if (C4887nc.a.equals(O5.this.b.e())) {
                    rd = C4758g8.a(O5.this.b.b(), this.a, arrayListD);
                }
                O5.this.a("response status code: " + rd.a);
            } catch (Exception e) {
                C4950r4.d().a(e);
            }
        }
    }

    private void b(String str) {
        this.d.submit(new a(str));
    }

    public void a(String str, Map<String, Object> map) {
        Locale locale = Locale.ENGLISH;
        a(h50.i(str, " ", map.toString()));
        if (this.b.a() && !str.isEmpty()) {
            HashMap mapM = q63.m(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.W, str);
            a(mapM, this.a.a());
            a(mapM, map);
            b(this.c.a(mapM));
        }
    }

    public O5(I5 i5, InterfaceC4936q7 interfaceC4936q7) {
        if (i5 != null) {
            if (i5.c() != null) {
                this.b = i5;
                this.a = interfaceC4936q7;
                this.c = i5.c();
                this.d = Executors.newSingleThreadExecutor();
                return;
            }
            throw new InvalidParameterException("Null formatter not supported ");
        }
        throw new InvalidParameterException("Null configuration not supported ");
    }

    private void a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e2) {
            C4950r4.d().a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.b.f()) {
            Log.d(e, str);
        }
    }
}
