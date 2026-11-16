package com.inmobi.media;

import android.content.Context;
import defpackage.cm2;
import defpackage.gd1;
import defpackage.s71;
import defpackage.ya2;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class T9 {
    public static final gd1 a = new cm2(new ya2(16));
    public static final gd1 b = new cm2(new ya2(17));

    public static final I9 a() {
        Context context = AbstractC4221mk.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Zl("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        arrayList.add(new Zl("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        arrayList.add(new Zl("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        arrayList.add(new Zl("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        arrayList.add(new Zl("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        arrayList.add(new Zl("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        arrayList.add(new Zl("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT,status TEXT)"));
        arrayList.add(new Zl("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        Object value = b.getValue();
        value.getClass();
        L5 l5 = new L5(context, arrayList, AbstractC4570zb.a(), (ExecutorService) value);
        I9 i9 = new I9(l5);
        C4127ja c4127ja = new C4127ja(l5);
        S9 s9 = new S9(c4127ja, l5);
        i9.a = s9;
        try {
            s9.c = c4127ja.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            s9.d = s9.a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        ExecutorService executorService = s9.b.d;
        if (executorService != null) {
            s9.e = defpackage.ak.h(executorService);
        }
        return i9;
    }

    public static final S9 b() {
        S9 s9 = ((I9) a.getValue()).a;
        if (s9 != null) {
            return s9;
        }
        s71.D("_inmobiDatabaseHelper");
        throw null;
    }

    public static final ExecutorService c() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC4239na("db.transactionExecutor", false));
    }
}
