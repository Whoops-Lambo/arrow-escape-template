package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class zzfzj extends AsyncTask {
    public zzfzk a;
    public final zzfzb b;

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfzk zzfzkVar = this.a;
        if (zzfzkVar != null) {
            zzfzkVar.c = null;
            zzfzj zzfzjVar = (zzfzj) zzfzkVar.b.poll();
            zzfzkVar.c = zzfzjVar;
            if (zzfzjVar != null) {
                zzfzjVar.executeOnExecutor(zzfzkVar.a, new Object[0]);
            }
        }
    }

    public zzfzj(zzfzb zzfzbVar) {
        this.b = zzfzbVar;
    }
}
