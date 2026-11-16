package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.sqlite.CursorWrapper;
import defpackage.d;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();
    private static final Builder zak = new zab(new String[0], null);

    @SafeParcelable.VersionField(id = 1000)
    final int zaa;
    Bundle zab;
    int[] zac;
    int zad;

    @GuardedBy
    int zae;

    @SafeParcelable.Field(getter = "getColumns", id = 1)
    private final String[] zaf;

    @SafeParcelable.Field(getter = "getWindows", id = 2)
    private final CursorWindow[] zag;

    @SafeParcelable.Field(getter = "getStatusCode", id = 3)
    private final int zah;

    @Nullable
    @SafeParcelable.Field(getter = "getMetadata", id = 4)
    private final Bundle zai;
    private boolean zaj;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static class Builder {
        private final String[] zaa;
        private final ArrayList zab = new ArrayList();
        private final HashMap zac = new HashMap();

        @NonNull
        @KeepForSdk
        public DataHolder build(int i, @NonNull Bundle bundle) {
            return new DataHolder(this, i, bundle, -1, (byte[]) null);
        }

        public final /* synthetic */ String[] zab() {
            return this.zaa;
        }

        public final /* synthetic */ ArrayList zac() {
            return this.zab;
        }

        public /* synthetic */ Builder(String[] strArr, String str, byte[] bArr) {
            this.zaa = (String[]) Preconditions.checkNotNull(strArr);
        }

        @NonNull
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap map = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                map.put(entry.getKey(), entry.getValue());
            }
            return zaa(map);
        }

        @NonNull
        public Builder zaa(@NonNull HashMap map) {
            Asserts.checkNotNull(map);
            this.zab.add(map);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i, (Bundle) null, (byte[]) (0 == true ? 1 : 0));
        }
    }

    @KeepForSdk
    public void acquireReference() {
        synchronized (this) {
            try {
                int i = this.zae;
                if (i <= 0) {
                    throw new IllegalStateException("Attempt to acquire reference to an already-closed DataHolder");
                }
                this.zae = i + 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    @KeepForSdk
    public DataHolder copy() {
        DataHolder dataHolder;
        synchronized (this) {
            if (isClosed()) {
                throw new IllegalStateException("Cannot copy a closed DataHolder");
            }
            CursorWindow[] cursorWindowArr = this.zag;
            CursorWindow[] cursorWindowArr2 = (CursorWindow[]) Arrays.copyOf(cursorWindowArr, cursorWindowArr.length);
            for (int i = 0; i < cursorWindowArr2.length; i++) {
                try {
                    cursorWindowArr2[i].acquireReference();
                } catch (RuntimeException e) {
                    for (int i2 = 0; i2 < i; i2++) {
                        cursorWindowArr2[i2].releaseReference();
                    }
                    if (e instanceof IllegalStateException) {
                        throw new IllegalStateException("Closed CursorWindow encountered during DataHolder copy", e);
                    }
                    throw e;
                }
            }
            dataHolder = new DataHolder(this.zaf, cursorWindowArr2, this.zah, this.zai);
        }
        return dataHolder;
    }

    @KeepForSdk
    public int getWindowIndex(int i) {
        int length;
        int i2 = 0;
        Preconditions.checkState(i >= 0 && i < this.zad);
        while (true) {
            int[] iArr = this.zac;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.zae <= 0;
        }
        return z;
    }

    @KeepForSdk
    public void releaseReference() {
        synchronized (this) {
            try {
                int i = this.zae - 1;
                this.zae = i;
                if (i == 0) {
                    for (CursorWindow cursorWindow : this.zag) {
                        cursorWindow.releaseReference();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public DataHolder(@NonNull Cursor cursor, int i, @Nullable Bundle bundle) {
        int startPosition;
        CursorWrapper cursorWrapper = new CursorWrapper(cursor);
        String[] columnNames = cursorWrapper.getColumnNames();
        ArrayList arrayList = new ArrayList();
        try {
            int count = cursorWrapper.getCount();
            CursorWindow window = cursorWrapper.getWindow();
            if (window == null || window.getStartPosition() != 0) {
                startPosition = 0;
            } else {
                window.acquireReference();
                cursorWrapper.setWindow(null);
                arrayList.add(window);
                startPosition = window.getNumRows();
            }
            while (startPosition < count && cursorWrapper.moveToPosition(startPosition)) {
                CursorWindow window2 = cursorWrapper.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    cursorWrapper.setWindow(null);
                } else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(startPosition);
                    cursorWrapper.fillWindow(startPosition, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                arrayList.add(window2);
                startPosition = window2.getStartPosition() + window2.getNumRows();
            }
            cursorWrapper.close();
            this(columnNames, (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]), i, bundle);
        } catch (Throwable th) {
            cursorWrapper.close();
            throw th;
        }
    }

    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, 0 == true ? 1 : 0);
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i) {
        return new DataHolder(zak, i, (Bundle) null);
    }

    private final void zaf(String str, int i) {
        Bundle bundle = this.zab;
        if (bundle == null || !bundle.containsKey(str)) {
            d.r("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            d.r("Buffer is closed.");
        } else if (i < 0 || i >= this.zad) {
            throw new CursorIndexOutOfBoundsException(i, this.zad);
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.zaj && this.zag.length > 0 && !isClosed()) {
                synchronized (this) {
                    try {
                        if (this.zae > 1) {
                            this.zae = 1;
                        }
                        releaseReference();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String string = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @KeepForSdk
    public int getCount() {
        return this.zad;
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.zai;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.zah;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.zab.containsKey(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        String[] strArr = this.zaf;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zag, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zaa);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        if ((i & 1) != 0) {
            releaseReference();
        }
    }

    public final void zaa() {
        this.zab = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.zaf;
            if (i >= strArr.length) {
                break;
            }
            this.zab.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.zag;
        this.zac = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i2 = 0; i2 < cursorWindowArr.length; i2++) {
            this.zac[i2] = numRows;
            numRows += cursorWindowArr[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
        }
        this.zad = numRows;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01db A[LOOP:2: B:72:0x01d9->B:73:0x01db, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    private static CursorWindow[] zae(Builder builder, int i) {
        ?? r9;
        boolean z;
        int size;
        ?? r7;
        ArrayList arrayList;
        String str;
        String str2;
        boolean z2;
        ?? r10;
        boolean z3;
        String str3;
        String str4;
        boolean zPutDouble;
        long j;
        CursorWindow cursorWindow;
        String str5 = ")";
        String str6 = "Allocating additional cursor window for large data set (row ";
        boolean z4 = false;
        if (builder.zab().length == 0) {
            return new CursorWindow[0];
        }
        ArrayList arrayListZac = builder.zac();
        int size2 = arrayListZac.size();
        CursorWindow cursorWindow2 = new CursorWindow(false);
        ?? arrayList2 = new ArrayList();
        arrayList2.add(cursorWindow2);
        cursorWindow2.setNumColumns(builder.zab().length);
        int i2 = 0;
        boolean z5 = false;
        while (i2 < size2) {
            try {
                r9 = cursorWindow2;
                boolean zAllocRow = r9.allocRow();
                ?? r11 = r9;
                if (!zAllocRow) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 61);
                    sb.append(str6);
                    sb.append(i2);
                    sb.append(str5);
                    Log.d("DataHolder", sb.toString());
                    cursorWindow = new CursorWindow(z4);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.zab().length);
                    arrayList2.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        r11 = cursorWindow;
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList2.remove(cursorWindow);
                        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
                    }
                }
                r11 = cursorWindow;
                Map map = (Map) arrayListZac.get(i2);
                boolean zPutString = true;
                ?? r8 = z4;
                while (true) {
                    try {
                        if (r8 < builder.zab().length) {
                            if (zPutString) {
                                String str7 = builder.zab()[r8];
                                ArrayList arrayList3 = arrayListZac;
                                Object obj = map.get(str7);
                                if (obj == null) {
                                    zPutString = r11.putNull(i2, r8);
                                    str3 = str5;
                                } else {
                                    str3 = str5;
                                    if (obj instanceof String) {
                                        zPutString = r11.putString((String) obj, i2, r8);
                                    } else {
                                        if (obj instanceof Long) {
                                            str4 = str6;
                                            zPutDouble = r11.putLong(((Long) obj).longValue(), i2, r8);
                                        } else {
                                            str4 = str6;
                                            if (obj instanceof Integer) {
                                                zPutDouble = r11.putLong(((Integer) obj).intValue(), i2, r8);
                                            } else if (obj instanceof Boolean) {
                                                if (true != ((Boolean) obj).booleanValue()) {
                                                    j = 0;
                                                } else {
                                                    j = 1;
                                                }
                                                zPutDouble = r11.putLong(j, i2, r8);
                                            } else if (obj instanceof byte[]) {
                                                zPutDouble = r11.putBlob((byte[]) obj, i2, r8);
                                            } else if (obj instanceof Double) {
                                                zPutDouble = r11.putDouble(((Double) obj).doubleValue(), i2, r8);
                                            } else if (obj instanceof Float) {
                                                zPutDouble = r11.putDouble(((Float) obj).floatValue(), i2, r8);
                                            } else {
                                                String string = obj.toString();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str7).length() + 32 + string.length());
                                                sb2.append("Unsupported object for column ");
                                                sb2.append(str7);
                                                sb2.append(": ");
                                                sb2.append(string);
                                                throw new IllegalArgumentException(sb2.toString());
                                            }
                                        }
                                        zPutString = zPutDouble;
                                    }
                                    arrayListZac = arrayList3;
                                    str5 = str3;
                                    str6 = str4;
                                    r8++;
                                }
                                str4 = str6;
                                arrayListZac = arrayList3;
                                str5 = str3;
                                str6 = str4;
                                r8++;
                            } else {
                                arrayList = arrayListZac;
                                str = str5;
                                str2 = str6;
                            }
                            size = arrayList2.size();
                            for (r7 = z; r7 < size; r7++) {
                                ((CursorWindow) arrayList2.get(r7)).close();
                            }
                            throw e;
                        }
                        arrayList = arrayListZac;
                        str = str5;
                        str2 = str6;
                        if (zPutString) {
                            z2 = false;
                            z5 = false;
                            r10 = r11;
                        }
                        i2++;
                        z4 = z2;
                        arrayListZac = arrayList;
                        str5 = str;
                        str6 = str2;
                        r9 = r10;
                        if (!z5) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 63);
                            sb3.append("Couldn't populate window data for row ");
                            sb3.append(i2);
                            sb3.append(" - allocating new window.");
                            Log.d("DataHolder", sb3.toString());
                            r11.freeLastRow();
                            z3 = false;
                            z2 = false;
                            try {
                                CursorWindow cursorWindow3 = new CursorWindow(false);
                                cursorWindow3.setStartPosition(i2);
                                cursorWindow3.setNumColumns(builder.zab().length);
                                arrayList2.add(cursorWindow3);
                                i2--;
                                r10 = cursorWindow3;
                                z5 = true;
                                i2++;
                                z4 = z2;
                                arrayListZac = arrayList;
                                str5 = str;
                                str6 = str2;
                                r9 = r10;
                            } catch (RuntimeException e) {
                                e = e;
                                z = z3;
                            }
                        } else {
                            z3 = false;
                            throw new zac("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                        }
                        e = e;
                        z = z3;
                    } catch (RuntimeException e2) {
                        e = e2;
                        z = false;
                    }
                    size = arrayList2.size();
                    while (r7 < size) {
                        ((CursorWindow) arrayList2.get(r7)).close();
                    }
                    throw e;
                }
            } catch (RuntimeException e3) {
                e = e3;
                z = z4;
            }
        }
        r9 = cursorWindow2;
        return (CursorWindow[]) arrayList2.toArray(new CursorWindow[arrayList2.size()]);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        releaseReference();
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i, int i2) {
        zaf(str, i);
        if (this.zag[i2].getLong(i, this.zab.getInt(str)) == 1) {
            return true;
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getBlob(i, this.zab.getInt(str));
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getInt(i, this.zab.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getLong(i, this.zab.getInt(str));
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getString(i, this.zab.getInt(str));
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].isNull(i, this.zab.getInt(str));
    }

    public final float zab(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getFloat(i, this.zab.getInt(str));
    }

    public final double zac(@NonNull String str, int i, int i2) {
        zaf(str, i);
        return this.zag[i2].getDouble(i, this.zab.getInt(str));
    }

    public final void zad(@NonNull String str, int i, int i2, @NonNull CharArrayBuffer charArrayBuffer) {
        zaf(str, i);
        this.zag[i2].copyStringToBuffer(i, this.zab.getInt(str), charArrayBuffer);
    }

    @SafeParcelable.Constructor
    public DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @Nullable @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.zae = 1;
        this.zaj = true;
        this.zaa = i;
        this.zaf = strArr;
        this.zag = cursorWindowArr;
        this.zah = i2;
        this.zai = bundle;
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.zae = 1;
        this.zaj = true;
        this.zaa = 1;
        this.zaf = (String[]) Preconditions.checkNotNull(strArr);
        this.zag = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.zah = i;
        this.zai = bundle;
        zaa();
    }

    public /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, byte[] bArr) {
        this(builder, i, (Bundle) null);
    }

    private DataHolder(Builder builder, int i, @Nullable Bundle bundle) {
        this(builder.zab(), zae(builder, -1), i, (Bundle) null);
    }

    public /* synthetic */ DataHolder(Builder builder, int i, Bundle bundle, int i2, byte[] bArr) {
        this(builder.zab(), zae(builder, -1), i, bundle);
    }
}
