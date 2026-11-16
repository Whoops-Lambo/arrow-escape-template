package com.bytedance.kgy;

import com.bytedance.kgy.kgy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class ahm<T extends kgy<?>> {
    public abstract long ahm();

    public abstract String ct();

    public abstract rz.InterfaceC0202rz fi();

    public abstract int gf();

    public abstract long kgy();

    public abstract T kgy(String str, byte[] bArr, int i, int i2);

    public abstract void kgy(ArrayList<T> arrayList, rz.ahm<T> ahmVar);

    public abstract long noq();

    public abstract long nu();

    public abstract int ra();

    public abstract int rz();

    public abstract boolean yo();

    public final String uq() {
        return "CREATE TABLE IF NOT EXISTS " + ct() + " (_id INTEGER PRIMARY KEY AUTOINCREMENT, data_id TEXT UNIQUE, data BLOB, priority INTEGER DEFAULT 0, upload_retry_count INTEGER DEFAULT 0, create_time INTEGER, cypher_type INTEGER DEFAULT 0);";
    }
}
