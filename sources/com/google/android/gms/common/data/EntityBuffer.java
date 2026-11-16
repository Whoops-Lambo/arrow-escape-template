package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.d;
import defpackage.rl3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @Nullable
    @KeepForSdk
    public String getChildDataMarkerColumn() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public abstract T getEntry(int i, int i2);

    @NonNull
    @KeepForSdk
    public abstract String getPrimaryDataMarkerColumn();

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i = 1; i < count; i++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i, windowIndex);
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder(String.valueOf(primaryDataMarkerColumn).length() + 42 + String.valueOf(i).length() + 14 + String.valueOf(windowIndex).length());
                                sb.append("Missing value for markerColumn: ");
                                sb.append(primaryDataMarkerColumn);
                                sb.append(", at row: ");
                                sb.append(i);
                                sb.append(", for window: ");
                                sb.append(windowIndex);
                                throw new NullPointerException(sb.toString());
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zaa(int i) {
        if (i >= 0 && i < this.zab.size()) {
            return ((Integer) this.zab.get(i)).intValue();
        }
        d.r(rl3.k(new StringBuilder(String.valueOf(i).length() + 42), "Position ", i, " is out of bounds for this buffer"));
        return 0;
    }

    @KeepForSdk
    public EntityBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @NonNull
    @KeepForSdk
    public final T get(int i) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i);
        int i2 = 0;
        if (i >= 0 && i != this.zab.size()) {
            if (i == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i)).intValue();
            }
            int i3 = iIntValue - iIntValue2;
            if (i3 == 1) {
                int iZaa2 = zaa(i);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i2 = 1;
                }
            } else {
                i2 = i3;
            }
        }
        return getEntry(iZaa, i2);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }
}
