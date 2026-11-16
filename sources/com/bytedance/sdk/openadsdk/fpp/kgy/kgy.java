package com.bytedance.sdk.openadsdk.fpp.kgy;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy implements Cursor {
    String[] ahm;
    Map<String, List<String>> kgy;
    int rz = 0;

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        return 0;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.ahm;
            if (strArr != null && strArr.length != 0) {
                return this.kgy.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "XOs5tgypZ9M=", 39);
            return 0;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getType(int i) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.ahm;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.ahm;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i = 0;
        while (true) {
            String[] strArr2 = this.ahm;
            if (i >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i])) {
                return i;
            }
            i++;
        }
    }

    @Override // android.database.Cursor
    public String getColumnName(int i) {
        if (i < 0) {
            return "";
        }
        String[] strArr = this.ahm;
        return i < strArr.length ? strArr[i] : "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.ahm;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.rz;
    }

    @Override // android.database.Cursor
    public String getString(int i) {
        return (i < 0 || i >= getColumnCount()) ? "" : this.kgy.get(this.ahm[i]).get(getPosition());
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.rz == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.rz == getCount() - 1;
    }

    @Override // android.database.Cursor
    public boolean move(int i) {
        if (this.rz + i >= getCount()) {
            return false;
        }
        this.rz += i;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.rz + 1 >= getCount()) {
            return false;
        }
        this.rz++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i = this.rz;
        if (i - 1 < 0) {
            return false;
        }
        this.rz = i - 1;
        return true;
    }

    public kgy(Map<String, List<String>> map) {
        if (map != null && map.keySet() != null) {
            this.kgy = map;
            try {
                this.ahm = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
                return;
            } catch (Exception e) {
                rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "B+cjnBfi", 27);
                return;
            }
        }
        this.kgy = new HashMap();
    }

    @Override // android.database.Cursor
    public double getDouble(int i) {
        try {
            return Double.parseDouble(getString(i));
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "XOs5sQypa8uF", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public float getFloat(int i) {
        try {
            return Float.parseFloat(getString(i));
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "XOs5sw+zaNM=", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i) {
        try {
            return Integer.parseInt(getString(i));
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "XOs5vA2o", 195);
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i) {
        try {
            return Long.parseLong(getString(i));
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "XOs5uQyybg==", 205);
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public short getShort(int i) {
        try {
            return Short.parseShort(getString(i));
        } catch (Exception e) {
            rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4EErDxS/j+aTb1gw4w=", "du89thauesiS", "XOs5pguze9M=", 186);
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public boolean isNull(int i) {
        if (getString(i) == null) {
            return true;
        }
        return false;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.rz = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.rz = this.kgy.get(this.ahm[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i) {
        if (i >= getCount()) {
            return false;
        }
        this.rz = i;
        return true;
    }
}
