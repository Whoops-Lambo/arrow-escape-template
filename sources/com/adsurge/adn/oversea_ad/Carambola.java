package com.adsurge.adn.oversea_ad;

import android.location.Location;
import android.location.LocationListener;
import android.os.Build;
import android.os.Bundle;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Carambola implements LocationListener {
    public static final Bullace f = new Bullace();
    public final Cantaloupe[] a = new Cantaloupe[3];
    public volatile int b = 0;
    public final Cantaloupe c = new Cantaloupe();
    public volatile boolean d = false;
    public volatile boolean e = false;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public final String a() {
        String strValueOf;
        String strValueOf2;
        String strValueOf3;
        String strValueOf4;
        String strValueOf5;
        String str;
        if (!this.d) {
            return null;
        }
        synchronized (this.c) {
            try {
                long j = this.c.a;
                String strValueOf6 = j > 0 ? String.valueOf(j) : "";
                String strValueOf7 = String.valueOf(this.c.c);
                String strValueOf8 = String.valueOf(this.c.d);
                Double d = this.c.e;
                if (d != null) {
                    double dDoubleValue = d.doubleValue();
                    DecimalFormat decimalFormat = (DecimalFormat) c.a.get();
                    strValueOf = decimalFormat == null ? String.valueOf(dDoubleValue) : decimalFormat.format(dDoubleValue);
                } else {
                    strValueOf = "";
                }
                Float f2 = this.c.f;
                if (f2 != null) {
                    double dFloatValue = f2.floatValue();
                    DecimalFormat decimalFormat2 = (DecimalFormat) c.a.get();
                    strValueOf2 = decimalFormat2 == null ? String.valueOf(dFloatValue) : decimalFormat2.format(dFloatValue);
                } else {
                    strValueOf2 = "";
                }
                Float f3 = this.c.g;
                if (f3 != null) {
                    double dFloatValue2 = f3.floatValue();
                    DecimalFormat decimalFormat3 = (DecimalFormat) c.a.get();
                    strValueOf3 = decimalFormat3 == null ? String.valueOf(dFloatValue2) : decimalFormat3.format(dFloatValue2);
                } else {
                    strValueOf3 = "";
                }
                Float f4 = this.c.h;
                if (f4 != null) {
                    double dFloatValue3 = f4.floatValue();
                    DecimalFormat decimalFormat4 = (DecimalFormat) c.a.get();
                    strValueOf4 = decimalFormat4 == null ? String.valueOf(dFloatValue3) : decimalFormat4.format(dFloatValue3);
                } else {
                    strValueOf4 = "";
                }
                Float f5 = this.c.i;
                if (f5 != null) {
                    double dFloatValue4 = f5.floatValue();
                    DecimalFormat decimalFormat5 = (DecimalFormat) c.a.get();
                    strValueOf5 = decimalFormat5 == null ? String.valueOf(dFloatValue4) : decimalFormat5.format(dFloatValue4);
                } else {
                    strValueOf5 = "";
                }
                String str2 = this.c.b;
                if (str2 == null) {
                    str2 = "";
                }
                str = strValueOf6 + "," + strValueOf7 + "," + strValueOf8 + "," + strValueOf + "," + strValueOf2 + "," + strValueOf3 + "," + strValueOf4 + "," + strValueOf5 + "," + str2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.a) {
            try {
                int length = this.b;
                do {
                    Cantaloupe cantaloupe = this.a[length];
                    if (cantaloupe == null) {
                        break;
                    }
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(cantaloupe.a);
                    sb.append(":");
                    sb.append(cantaloupe.b);
                    length--;
                    if (length < 0) {
                        length = this.a.length - 1;
                    }
                } while (length != this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location == null) {
            return;
        }
        synchronized (this.c) {
            try {
                this.c.a = System.currentTimeMillis();
                if (this.e) {
                    this.c.b = location.getProvider();
                    this.c.c = location.getLatitude();
                    this.c.d = location.getLongitude();
                    this.c.e = location.hasAltitude() ? Double.valueOf(location.getAltitude()) : null;
                    this.c.f = location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : null;
                    this.c.g = (Build.VERSION.SDK_INT < 26 || !location.hasVerticalAccuracy()) ? null : Float.valueOf(location.getVerticalAccuracyMeters());
                    this.c.h = location.hasBearing() ? Float.valueOf(location.getBearing()) : null;
                    this.c.i = location.hasSpeed() ? Float.valueOf(location.getSpeed()) : null;
                    this.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (location.isFromMockProvider()) {
            synchronized (this.c) {
                synchronized (this.a) {
                    try {
                        Cantaloupe cantaloupe = this.a[this.b];
                        if (cantaloupe == null) {
                            cantaloupe = new Cantaloupe();
                            this.a[this.b] = cantaloupe;
                        }
                        this.b = (this.b + 1) % this.a.length;
                        cantaloupe.a = this.c.a;
                        if (this.d) {
                            Cantaloupe cantaloupe2 = this.c;
                            cantaloupe.b = cantaloupe2.b;
                            cantaloupe.c = cantaloupe2.c;
                            cantaloupe.d = cantaloupe2.d;
                            cantaloupe.e = cantaloupe2.e;
                            cantaloupe.f = cantaloupe2.f;
                            cantaloupe.g = cantaloupe2.g;
                            cantaloupe.h = cantaloupe2.h;
                            cantaloupe.i = cantaloupe2.i;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }
}
