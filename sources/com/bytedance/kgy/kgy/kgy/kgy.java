package com.bytedance.kgy.kgy.kgy;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.bytedance.kgy.kgy.ahm;
import com.bytedance.kgy.kgy.fi;
import com.bytedance.kgy.kgy.yo;
import com.bytedance.kgy.rz;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy implements Handler.Callback {
    private final ahm ahm;
    private final SparseIntArray ct = new SparseIntArray();
    private final String kgy;
    private Handler noq;
    private final String rz;
    private final rz.InterfaceC0202rz uq;

    private void ahm() {
        Objects.toString(this.ct);
        JSONObject jSONObject = new JSONObject();
        synchronized (this.ct) {
            for (int i = 0; i < this.ct.size(); i++) {
                try {
                    jSONObject.putOpt(String.valueOf(this.ct.keyAt(i)), Integer.valueOf(this.ct.valueAt(i)));
                } catch (Exception unused) {
                }
            }
        }
        if (jSONObject.length() > 0) {
            SharedPreferences.Editor editorEdit = rz().edit();
            editorEdit.putString("event_counts", jSONObject.toString());
            editorEdit.apply();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 10000) {
            return true;
        }
        ahm();
        return true;
    }

    public kgy(ahm ahmVar, String str, rz.InterfaceC0202rz interfaceC0202rz) {
        this.kgy = ahmVar.rz().uq();
        this.ahm = ahmVar;
        this.rz = str;
        this.uq = interfaceC0202rz;
    }

    private SharedPreferences rz() {
        return yo.kgy().getSharedPreferences("event_monitor_" + this.kgy + "_" + this.rz + "_" + com.bytedance.kgy.kgy.ahm.ahm.kgy(), 0);
    }

    public void kgy(Looper looper, fi<? extends com.bytedance.kgy.kgy> fiVar) {
        long j = rz().getLong("last_upload_time", 0L);
        long jKgy = this.uq.kgy();
        if (j > 0 && System.currentTimeMillis() - j > jKgy) {
            kgy(fiVar);
        } else {
            SharedPreferences sharedPreferencesRz = rz();
            String string = sharedPreferencesRz.getString("event_counts", null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> itKeys = jSONObject.keys();
                    synchronized (this.ct) {
                        while (itKeys.hasNext()) {
                            try {
                                String next = itKeys.next();
                                this.ct.put(Integer.parseInt(next), jSONObject.getInt(next));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (j == 0) {
                sharedPreferencesRz.edit().putLong("last_upload_time", System.currentTimeMillis()).apply();
            }
            Objects.toString(this.ct);
        }
        this.noq = new Handler(looper, this);
    }

    public void kgy(int i, int i2) {
        synchronized (this.ct) {
            this.ct.put(i, this.ct.get(i) + i2);
        }
    }

    public void kgy() {
        Handler handler = this.noq;
        if (handler == null || handler.hasMessages(10000)) {
            return;
        }
        this.noq.sendEmptyMessageDelayed(10000, 60000L);
    }

    public void kgy(int i) {
        kgy(i, 1);
    }

    private void kgy(fi<? extends com.bytedance.kgy.kgy> fiVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("instance_id", this.kgy);
            jSONObject.putOpt(StatsEvent.z, this.rz);
            jSONObject.putOpt("db_data_count", Integer.valueOf(fiVar.rz(this.ahm.kgy())));
            SharedPreferences sharedPreferencesRz = rz();
            Map<String, ?> all = sharedPreferencesRz.getAll();
            for (String str : all.keySet()) {
                if (!"last_upload_time".equals(str)) {
                    jSONObject.put(str, all.get(str));
                }
            }
            this.uq.kgy(jSONObject.toString());
            sharedPreferencesRz.edit().clear().putLong("last_upload_time", System.currentTimeMillis()).apply();
        } catch (Throwable unused) {
        }
    }
}
