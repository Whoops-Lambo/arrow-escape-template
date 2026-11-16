package com.bytedance.kgy.kgy;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import com.bytedance.kgy.kgy;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class fi<T extends com.bytedance.kgy.kgy<?>> {
    private volatile long at;
    private volatile boolean kus;
    private SQLiteStatement nu;
    private com.bytedance.kgy.kgy.kgy.kgy ra;
    private final ahm rz;
    private volatile long twf;
    private final com.bytedance.kgy.ahm<T> uq;
    private final ArrayList<T> ahm = new ArrayList<>();
    private final HashSet<String> ct = new HashSet<>();
    private final HashSet<String> noq = new HashSet<>();
    private final HashSet<String> yo = new HashSet<>();
    private final HashSet<String> fi = new HashSet<>();
    private final AtomicInteger gf = new AtomicInteger(0);
    volatile AtomicInteger kgy = new AtomicInteger(0);

    /* JADX WARN: Code duplicated, block: B:40:0x002c A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r10
  0x002c: PHI (r10v3 android.database.Cursor) = (r10v2 android.database.Cursor), (r10v6 android.database.Cursor) binds: [B:20:0x003e, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public final int rz(gf gfVar) {
        Cursor cursorQuery;
        try {
            cursorQuery = gfVar.getReadableDatabase().query(this.uq.ct(), new String[]{"count(*)"}, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(0);
                        try {
                            cursorQuery.close();
                        } catch (Exception unused) {
                        }
                        return i;
                    }
                } catch (Throwable unused2) {
                    try {
                        com.bytedance.kgy.kgy.kgy.kgy kgyVar = this.ra;
                        if (kgyVar != null) {
                            kgyVar.kgy(10007);
                        }
                    } finally {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
            if (cursorQuery != null) {
            }
        } catch (Throwable unused4) {
            cursorQuery = null;
        }
        return 0;
    }

    private void noq(gf gfVar) {
        HashSet<String> hashSet;
        SQLiteDatabase writableDatabase;
        if (this.noq.isEmpty()) {
            return;
        }
        synchronized (this.noq) {
            hashSet = new HashSet(this.noq);
            this.noq.clear();
            try {
            } catch (Exception unused) {
                return;
            }
        }
        try {
            writableDatabase = gfVar.getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                HashSet hashSet2 = new HashSet();
                for (String str : hashSet) {
                    if (writableDatabase.delete(this.uq.ct(), "data_id = ?", new String[]{str}) == 0) {
                        hashSet2.add(str);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                hashSet.size();
                hashSet2.size();
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable unused2) {
                try {
                    com.bytedance.kgy.kgy.kgy.kgy kgyVar = this.ra;
                    if (kgyVar != null) {
                        kgyVar.kgy(10002);
                    }
                    if (writableDatabase == null || !writableDatabase.inTransaction()) {
                        return;
                    }
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                            if (writableDatabase.inTransaction()) {
                                writableDatabase.endTransaction();
                            }
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused4) {
            writableDatabase = null;
        }
    }

    public final void ahm(gf gfVar) {
        ArrayList<T> arrayList = new ArrayList<>(this.ahm.size());
        synchronized (this.ahm) {
            try {
                int size = this.ahm.size();
                for (int i = 0; i < size; i++) {
                    T t = this.ahm.get(i);
                    arrayList.add(t);
                    t.noq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.ct) {
            try {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    if (this.ct.contains(next.noq())) {
                        next.toString();
                        it.remove();
                    } else {
                        this.ct.add(next.noq());
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        kgy(gfVar, arrayList);
    }

    public final long ct() {
        long jKgy = this.uq.kgy();
        long jKgy2 = (long) (noq.kgy(false) * jKgy);
        long jAhm = this.uq.ahm();
        if (jAhm >= jKgy) {
            jKgy = jAhm;
        }
        if (jKgy2 <= 0 || jKgy2 > jKgy) {
            jKgy2 = 15000;
        }
        if (this.kgy.get() == 0) {
            return jKgy2;
        }
        long jMin = Math.min(jKgy, ((long) this.kgy.get()) * jKgy2);
        this.kgy.get();
        return jMin;
    }

    public String fi() {
        return this.uq.ct();
    }

    public boolean gf() {
        return !this.ct.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kgy(gf gfVar, int i) {
        Cursor cursor;
        String str;
        String[] strArr;
        int i2;
        ArrayList arrayList;
        this.gf.set(0);
        try {
            try {
                SQLiteDatabase readableDatabase = gfVar.getReadableDatabase();
                int iNoq = noq();
                if (this.ct.isEmpty()) {
                    str = null;
                    strArr = null;
                } else {
                    StringBuilder sb = new StringBuilder("data_id NOT IN (");
                    ArrayList arrayList2 = new ArrayList();
                    synchronized (this.ct) {
                        try {
                            for (String str2 : this.ct) {
                                if (!arrayList2.isEmpty()) {
                                    sb.append(",");
                                }
                                sb.append("?");
                                arrayList2.add(str2);
                                if (arrayList2.size() >= iNoq) {
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    sb.append(")");
                    String string = sb.toString();
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                    Arrays.toString(strArr2);
                    str = string;
                    strArr = strArr2;
                }
                Cursor cursorQuery = readableDatabase.query(this.uq.ct(), null, str, strArr, null, null, "priority DESC, create_time DESC", String.valueOf(iNoq * i * 2));
                if (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            toString();
                            cursorQuery.close();
                            return;
                        }
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("data");
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("data_id");
                        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
                        int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("upload_retry_count");
                        int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("cypher_type");
                        ArrayList arrayList3 = new ArrayList();
                        int i3 = 0;
                        while (true) {
                            try {
                                String string2 = cursorQuery.getString(columnIndexOrThrow2);
                                synchronized (this.ct) {
                                    try {
                                        if (this.ct.contains(string2)) {
                                            i2 = columnIndexOrThrow;
                                        } else {
                                            this.ct.add(string2);
                                            byte[] blob = cursorQuery.getBlob(columnIndexOrThrow);
                                            int i4 = cursorQuery.getInt(columnIndexOrThrow5);
                                            com.bytedance.kgy.rz.kgy kgyVarCt = this.rz.rz().ct();
                                            i2 = columnIndexOrThrow;
                                            if (kgyVarCt != null) {
                                                try {
                                                    blob = kgyVarCt.ahm(blob, i4);
                                                    com.bytedance.kgy.kgy.kgy.kgy kgyVar = this.ra;
                                                    if (kgyVar != null) {
                                                        if (i4 == 1) {
                                                            kgyVar.kgy(blob != null ? 15 : 16);
                                                        } else {
                                                            kgyVar.kgy(blob != null ? 7 : 8);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                    com.bytedance.kgy.kgy.kgy.kgy kgyVar2 = this.ra;
                                                    if (kgyVar2 != null) {
                                                        kgyVar2.kgy(11);
                                                    }
                                                }
                                            }
                                            if (blob == null) {
                                                synchronized (this.ct) {
                                                    this.ct.remove(string2);
                                                }
                                            } else {
                                                com.bytedance.kgy.kgy kgyVarKgy = this.uq.kgy(string2, blob, cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4));
                                                if (kgyVarKgy == null) {
                                                    synchronized (this.ct) {
                                                        this.ct.remove(string2);
                                                    }
                                                } else {
                                                    arrayList3.add(kgyVarKgy);
                                                    if (arrayList3.size() >= iNoq) {
                                                        kgy(arrayList3, gfVar, true, null);
                                                        i3++;
                                                        arrayList = new ArrayList();
                                                        if (i3 >= i) {
                                                            break;
                                                        } else {
                                                            arrayList3 = arrayList;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            } catch (Exception unused2) {
                                i2 = columnIndexOrThrow;
                            }
                            if (!cursorQuery.moveToNext()) {
                                arrayList = arrayList3;
                                break;
                            }
                            columnIndexOrThrow = i2;
                        }
                        if (!arrayList.isEmpty()) {
                            kgy(arrayList, gfVar, false, null);
                        }
                    } catch (Throwable unused3) {
                        cursor = cursorQuery;
                        try {
                            com.bytedance.kgy.kgy.kgy.kgy kgyVar3 = this.ra;
                            if (kgyVar3 != null) {
                                kgyVar3.kgy(10005);
                            }
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        } catch (Throwable th3) {
                            if (cursor != null) {
                                try {
                                    cursor.close();
                                } catch (Exception unused4) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable unused5) {
                cursor = null;
            }
        } catch (Exception unused6) {
        }
    }

    public long nu() {
        long jKgy = (long) (noq.kgy(true) * this.uq.nu());
        if (jKgy <= 0) {
            return 100L;
        }
        return jKgy;
    }

    public boolean ra() {
        return this.kus && this.gf.get() >= this.uq.gf();
    }

    public void uq(gf gfVar) {
        ArrayList<String> arrayList;
        synchronized (this.yo) {
            arrayList = new ArrayList<>(this.yo);
            this.yo.clear();
        }
        int i = 0;
        kgy(gfVar, arrayList, false);
        synchronized (this.ct) {
            try {
                int size = arrayList.size();
                while (i < size) {
                    String str = arrayList.get(i);
                    i++;
                    this.ct.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String yo() {
        return this.uq.uq();
    }

    public fi(ahm ahmVar, com.bytedance.kgy.ahm<T> ahmVar2) {
        com.bytedance.kgy.rz.InterfaceC0202rz interfaceC0202rzFi;
        this.rz = ahmVar;
        this.uq = ahmVar2;
        if (ahmVar2.yo() && (interfaceC0202rzFi = ahmVar2.fi()) != null) {
            this.ra = new com.bytedance.kgy.kgy.kgy.kgy(ahmVar, fi(), interfaceC0202rzFi);
        }
        if (ahmVar.rz().fi() >= ahmVar2.kgy()) {
            ahmVar2.toString();
        }
    }

    public com.bytedance.kgy.kgy.kgy.kgy uq() {
        return this.ra;
    }

    public void ct(gf gfVar) {
        ArrayList<String> arrayList;
        synchronized (this.fi) {
            arrayList = new ArrayList<>(this.fi);
            this.fi.clear();
        }
        ahm(gfVar, arrayList);
        synchronized (this.ct) {
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    String str = arrayList.get(i);
                    i++;
                    this.ct.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int rz() {
        return this.ahm.size();
    }

    private void ahm(gf gfVar, ArrayList<String> arrayList) {
        try {
            SQLiteDatabase writableDatabase = gfVar.getWritableDatabase();
            StringBuilder sb = new StringBuilder("(");
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                strArr[i] = arrayList.get(i);
                if (i > 0) {
                    sb.append(",");
                }
                sb.append("?");
            }
            sb.append(")");
            writableDatabase.execSQL("UPDATE " + this.uq.ct() + " SET upload_retry_count = upload_retry_count+1 WHERE data_id IN " + ((Object) sb), strArr);
            arrayList.size();
        } catch (Throwable unused) {
            com.bytedance.kgy.kgy.kgy.kgy kgyVar = this.ra;
            if (kgyVar != null) {
                kgyVar.kgy(10000);
            }
        }
    }

    public int ahm() {
        int iKgy = (int) (noq.kgy(true) * this.uq.ra());
        if (iKgy <= 0) {
            return 1;
        }
        return iKgy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.fi) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    T t = arrayList.get(i);
                    t.ahm(t.ct() + 1);
                    this.fi.add(t.noq());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.rz.ahm(this);
    }

    public final int noq() {
        int iKgy = (int) (noq.kgy(true) * this.uq.rz());
        if (iKgy <= 0) {
            return 100;
        }
        return iKgy;
    }

    public com.bytedance.kgy.ahm<T> kgy() {
        return this.uq;
    }

    public void kgy(gf gfVar) {
        com.bytedance.kgy.kgy.kgy.kgy kgyVar;
        long jNoq = this.uq.noq();
        if (jNoq <= 0) {
            return;
        }
        try {
            int iDelete = gfVar.getWritableDatabase().delete(this.uq.ct(), "create_time < ?", new String[]{String.valueOf(System.currentTimeMillis() - jNoq)});
            if (iDelete <= 0 || (kgyVar = this.ra) == null) {
                return;
            }
            kgyVar.kgy(4, iDelete);
        } catch (Throwable unused) {
            com.bytedance.kgy.kgy.kgy.kgy kgyVar2 = this.ra;
            if (kgyVar2 != null) {
                kgyVar2.kgy(GamesActivityResultCodes.RESULT_LICENSE_FAILED);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x010b A[Catch: Exception -> 0x0124, PHI: r1
  0x010b: PHI (r1v6 android.database.sqlite.SQLiteDatabase) = (r1v5 android.database.sqlite.SQLiteDatabase), (r1v7 android.database.sqlite.SQLiteDatabase) binds: [B:59:0x0109, B:67:0x0121] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {Exception -> 0x0124, blocks: (B:58:0x0105, B:60:0x010b, B:66:0x011d), top: B:102:0x0014 }] */
    public boolean kgy(com.bytedance.kgy.rz.ct ctVar, gf gfVar) {
        ArrayList arrayList;
        synchronized (this.ahm) {
            arrayList = new ArrayList(this.ahm);
        }
        boolean z = false;
        if (arrayList.isEmpty()) {
            return false;
        }
        SQLiteDatabase writableDatabase = null;
        try {
            try {
                try {
                    try {
                        writableDatabase = gfVar.getWritableDatabase();
                        writableDatabase.beginTransaction();
                        if (this.nu == null) {
                            this.nu = writableDatabase.compileStatement("INSERT OR REPLACE INTO " + this.uq.ct() + "(data_id,data,priority,upload_retry_count,create_time,cypher_type) VALUES (?,?,?,?,?,?)");
                        }
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            try {
                                com.bytedance.kgy.kgy kgyVar = (com.bytedance.kgy.kgy) arrayList.get(i);
                                byte[] bArrUq = kgyVar.uq();
                                if (bArrUq != null && bArrUq.length != 0) {
                                    com.bytedance.kgy.rz.kgy kgyVarCt = ctVar.ct();
                                    int i2 = -1;
                                    if (kgyVarCt != null) {
                                        int iRz = ctVar.rz();
                                        byte[] bArrKgy = kgyVarCt.kgy(bArrUq, iRz);
                                        com.bytedance.kgy.kgy.kgy.kgy kgyVar2 = this.ra;
                                        if (bArrKgy != null) {
                                            if (kgyVar2 != null) {
                                                if (iRz == 1) {
                                                    kgyVar2.kgy(13);
                                                } else {
                                                    kgyVar2.kgy(5);
                                                }
                                            }
                                            bArrUq = bArrKgy;
                                            i2 = iRz;
                                        } else if (kgyVar2 != null) {
                                            if (iRz == 1) {
                                                kgyVar2.kgy(14);
                                            } else {
                                                kgyVar2.kgy(6);
                                            }
                                        }
                                    }
                                    this.nu.clearBindings();
                                    this.nu.bindString(1, kgyVar.noq());
                                    this.nu.bindBlob(2, bArrUq);
                                    this.nu.bindLong(3, kgyVar.ahm());
                                    this.nu.bindLong(4, kgyVar.ct());
                                    this.nu.bindLong(5, kgyVar.kgy());
                                    this.nu.bindLong(6, i2);
                                    this.nu.executeInsert();
                                    kgyVar.noq();
                                } else {
                                    kgyVar.toString();
                                    com.bytedance.kgy.kgy.kgy.kgy kgyVar3 = this.ra;
                                    if (kgyVar3 != null) {
                                        kgyVar3.kgy(9);
                                    }
                                }
                            } catch (Exception unused) {
                                com.bytedance.kgy.kgy.kgy.kgy kgyVar4 = this.ra;
                                if (kgyVar4 != null) {
                                    kgyVar4.kgy(12);
                                }
                            }
                        }
                        writableDatabase.setTransactionSuccessful();
                        arrayList.size();
                        try {
                            if (writableDatabase.inTransaction()) {
                                writableDatabase.endTransaction();
                            }
                        } catch (Exception unused2) {
                        }
                        z = true;
                    } catch (Throwable unused3) {
                        com.bytedance.kgy.kgy.kgy.kgy kgyVar5 = this.ra;
                        if (kgyVar5 != null) {
                            kgyVar5.kgy(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED);
                        }
                        if (writableDatabase != null && writableDatabase.inTransaction()) {
                            writableDatabase.endTransaction();
                        }
                    }
                } catch (SQLiteFullException unused4) {
                    arrayList.size();
                    com.bytedance.kgy.kgy.kgy.kgy kgyVar6 = this.ra;
                    if (kgyVar6 != null) {
                        kgyVar6.kgy(GamesActivityResultCodes.RESULT_NETWORK_FAILURE);
                    }
                    if (writableDatabase != null && writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                }
                if (z) {
                    this.twf = SystemClock.elapsedRealtime();
                    this.gf.addAndGet(arrayList.size());
                    synchronized (this.ahm) {
                        this.ahm.removeAll(arrayList);
                        arrayList.size();
                    }
                    noq(gfVar);
                }
                return z;
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        if (writableDatabase.inTransaction()) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                        throw th;
                    } catch (Exception unused5) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        }
    }

    public final void kgy(gf gfVar, T t) {
        String strNoq = t.noq();
        synchronized (this.ct) {
            try {
                if (this.ct.contains(strNoq)) {
                    return;
                }
                this.ct.add(strNoq);
                ArrayList<T> arrayList = new ArrayList<>();
                arrayList.add(t);
                kgy(gfVar, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void kgy(gf gfVar, ArrayList<T> arrayList) {
        arrayList.size();
        if (arrayList.isEmpty()) {
            return;
        }
        kgy(arrayList, gfVar, false, new com.bytedance.kgy.rz.ahm<T>() { // from class: com.bytedance.kgy.kgy.fi.1
            @Override // com.bytedance.kgy.rz.ahm
            public void kgy(ArrayList<T> arrayList2, boolean z) {
                com.bytedance.kgy.ahm unused = fi.this.uq;
                arrayList2.size();
                if (z) {
                    synchronized (fi.this.ahm) {
                        fi.this.ahm.removeAll(arrayList2);
                    }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void kgy(ArrayList<T> arrayList, gf gfVar, final boolean z, final com.bytedance.kgy.rz.ahm<T> ahmVar) {
        arrayList.size();
        toString();
        this.at = SystemClock.elapsedRealtime();
        this.uq.kgy(arrayList, new com.bytedance.kgy.rz.ahm<T>() { // from class: com.bytedance.kgy.kgy.fi.2
            @Override // com.bytedance.kgy.rz.ahm
            public void kgy(ArrayList<T> arrayList2, boolean z2) {
                fi.this.kus = z2;
                int size = arrayList2.size();
                com.bytedance.kgy.ahm unused = fi.this.uq;
                boolean z3 = z || fi.this.twf > fi.this.at;
                fi fiVar = fi.this;
                if (z2) {
                    boolean z4 = fiVar.kgy.get() > 0;
                    fi.this.kgy.set(0);
                    fi.this.kgy(arrayList2);
                    fi.this.rz.kgy(fi.this, z3, true, z4);
                } else {
                    fiVar.kgy.getAndAdd(1);
                    fi.this.ahm(arrayList2);
                    fi.this.rz.kgy(fi.this, z3, false, false);
                }
                com.bytedance.kgy.rz.ahm ahmVar2 = ahmVar;
                if (ahmVar2 != null) {
                    ahmVar2.kgy(arrayList2, z2);
                }
                if (!z2 || fi.this.ra == null) {
                    return;
                }
                fi.this.ra.kgy(2, size);
            }
        });
    }

    private void kgy(gf gfVar, ArrayList<String> arrayList, boolean z) {
        SQLiteDatabase writableDatabase;
        boolean z2 = false;
        try {
            try {
                writableDatabase = gfVar.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    HashSet hashSet = new HashSet();
                    StringBuilder sb = new StringBuilder("(");
                    String[] strArr = new String[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        strArr[i] = arrayList.get(i);
                        if (i > 0) {
                            sb.append(",");
                        }
                        sb.append("?");
                    }
                    sb.append(")");
                    if (writableDatabase.delete(this.uq.ct(), "data_id in ".concat(String.valueOf(sb)), strArr) == 0) {
                        hashSet.addAll(arrayList);
                    } else {
                        z2 = true;
                    }
                    writableDatabase.setTransactionSuccessful();
                    arrayList.size();
                    hashSet.size();
                    hashSet.size();
                    if (z && !hashSet.isEmpty()) {
                        synchronized (this.noq) {
                            this.noq.addAll(hashSet);
                        }
                    }
                    if (writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                } catch (Throwable unused) {
                    if (z && !z2) {
                        try {
                            synchronized (this.noq) {
                                this.noq.addAll(arrayList);
                            }
                        } catch (Throwable th) {
                            if (writableDatabase != null) {
                                try {
                                    if (writableDatabase.inTransaction()) {
                                        writableDatabase.endTransaction();
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    com.bytedance.kgy.kgy.kgy.kgy kgyVar = this.ra;
                    if (kgyVar != null) {
                        kgyVar.kgy(10001);
                    }
                    if (writableDatabase == null || !writableDatabase.inTransaction()) {
                        return;
                    }
                    writableDatabase.endTransaction();
                }
            } catch (Throwable unused3) {
                writableDatabase = null;
            }
        } catch (Exception unused4) {
        }
    }

    public int kgy(T t) {
        int size;
        synchronized (this.ahm) {
            this.ahm.add(t);
            size = this.ahm.size();
        }
        if (t.ahm() == 1) {
            return 6;
        }
        return size % ahm() == 0 ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(ArrayList<T> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.yo) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    this.yo.add(arrayList.get(i).noq());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.rz.kgy(this);
    }
}
