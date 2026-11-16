package com.bytedance.adsdk.ahm;

import defpackage.d;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kus<K, V> {
    private int ahm;
    private int ct;
    private int fi;
    private final LinkedHashMap<K, V> kgy;
    private int noq;
    private int rz;
    private int uq;
    private int yo;

    public int ahm(K k, V v) {
        return 1;
    }

    public void kgy(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.ahm < 0 || (this.kgy.isEmpty() && this.ahm != 0)) {
                        break;
                    }
                    if (this.ahm > i && !this.kgy.isEmpty()) {
                        Map.Entry<K, V> next = this.kgy.entrySet().iterator().next();
                        K key = next.getKey();
                        V value = next.getValue();
                        this.kgy.remove(key);
                        this.ahm -= rz(key, value);
                        this.noq++;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.yo;
            int i3 = this.fi + i2;
            i = i3 != 0 ? (i2 * 100) / i3 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.rz + ",hits=" + this.yo + ",misses=" + this.fi + ",hitRate=" + i + "%]";
    }

    public kus(int i) {
        if (i > 0) {
            this.rz = i;
            this.kgy = new LinkedHashMap<>(0, 0.75f, true);
        } else {
            d.r("maxSize <= 0");
            throw null;
        }
    }

    private int rz(K k, V v) {
        int iAhm = ahm(k, v);
        if (iAhm >= 0) {
            return iAhm;
        }
        y.l("Negative size: ", k, "=", v);
        return 0;
    }

    public V ahm(K k) {
        return null;
    }

    public final V kgy(K k, V v) {
        V vPut;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.uq++;
                    this.ahm += rz(k, v);
                    vPut = this.kgy.put(k, v);
                    if (vPut != null) {
                        this.ahm -= rz(k, vPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            kgy(this.rz);
            return vPut;
        }
        d.w("key == null || value == null");
        return null;
    }

    public final V kgy(K k) {
        V vPut;
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.kgy.get(k);
                    if (v != null) {
                        this.yo++;
                        return v;
                    }
                    this.fi++;
                    V vAhm = ahm(k);
                    if (vAhm == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.ct++;
                            vPut = this.kgy.put(k, vAhm);
                            if (vPut != null) {
                                this.kgy.put(k, vPut);
                            } else {
                                this.ahm += rz(k, vAhm);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (vPut != null) {
                        return vPut;
                    }
                    kgy(this.rz);
                    return vAhm;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d.w("key == null");
        return null;
    }
}
