package com.bytedance.adsdk.ugeno.gf;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ahm {
    private DataSetObserver ahm;
    private final DataSetObservable kgy = new DataSetObservable();

    public Parcelable ahm() {
        return null;
    }

    public abstract int kgy();

    public abstract boolean kgy(View view, Object obj);

    public void rz() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.ahm;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.kgy.notifyChanged();
    }

    @Deprecated
    public Object kgy(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public int kgy(Object obj) {
        return -1;
    }

    public Object kgy(ViewGroup viewGroup, int i) {
        return kgy((View) viewGroup, i);
    }

    public void kgy(ViewGroup viewGroup, int i, Object obj) {
        kgy((View) viewGroup, i, obj);
    }

    public float kgy(int i) {
        return 1.0f;
    }

    @Deprecated
    public void kgy(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void kgy(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.ahm = dataSetObserver;
        }
    }
}
