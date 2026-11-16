package com.adsurge.adn.oversea_ad;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.package, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Cpackage extends Handler {
    public final Mandarin a;
    public final ArrayList b;

    public final void a() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Cherry cherry = (Cherry) obj;
            cherry.getClass();
            synchronized (Cherry.j) {
                try {
                    int i2 = Cherry.k;
                    if (i2 < 200) {
                        Cherry.k = i2 + 1;
                        cherry.a = Cherry.l;
                        cherry.i = 0;
                        Cherry.l = cherry;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.b.clear();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        k kVar = null;
        if (i == 1) {
            Object obj = message.obj;
            if (obj instanceof String) {
                Mandarin mandarin = this.a;
                Cprivate cprivate = new Cprivate((String) obj, 3, null);
                mandarin.getClass();
                Mandarin.a(cprivate);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        Object obj2 = message.obj;
        if (obj2 instanceof Cherry) {
            Cherry cherry = (Cherry) obj2;
            String str = cherry.b;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (!this.b.isEmpty() && !((Cherry) this.b.get(0)).b.equals(cherry.b)) {
                a();
            }
            int i2 = cherry.c;
            if (i2 == 0) {
                a();
                this.b.add(cherry);
                return;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    this.b.isEmpty();
                    this.b.add(cherry);
                    return;
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    a();
                    return;
                }
            }
            if (this.b.isEmpty()) {
                return;
            }
            this.b.add(cherry);
            ArrayList arrayList = this.b;
            ArrayList arrayList2 = new ArrayList();
            if (arrayList.size() <= 8) {
                arrayList2.addAll(arrayList);
            } else {
                Cherry cherry2 = (Cherry) arrayList.get(0);
                Cherry cherry3 = (Cherry) arrayList.get(arrayList.size() - 1);
                arrayList.remove(cherry2);
                arrayList.remove(cherry3);
                int iCeil = (int) Math.ceil(arrayList.size() / 6.0f);
                arrayList2.add(cherry2);
                for (int i3 = 1; i3 < arrayList.size(); i3 += iCeil) {
                    arrayList2.add(arrayList.get(i3));
                }
                arrayList2.add(cherry3);
            }
            if (!arrayList2.isEmpty()) {
                Cherry cherry4 = (Cherry) arrayList2.get(0);
                k kVar2 = new k();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = cherry4.h;
                kVar2.b = (int) (jCurrentTimeMillis - j);
                kVar2.a = j;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    Cherry cherry5 = (Cherry) obj3;
                    l lVar = new l();
                    int i5 = cherry5.c;
                    if (i5 == 0) {
                        lVar.a = 1;
                    } else if (i5 == 1) {
                        lVar.a = 3;
                    } else if (i5 == 2) {
                        lVar.a = 2;
                    } else if (i5 != 3) {
                        lVar.a = 0;
                    } else {
                        lVar.a = 4;
                    }
                    lVar.d = cherry5.f;
                    lVar.e = cherry5.g;
                    arrayList3.add(lVar);
                }
                kVar2.c = arrayList3;
                kVar = kVar2;
            }
            if (kVar == null) {
                return;
            }
            if (cherry.d <= 0) {
                kVar.d |= 1;
            }
            if (cherry.e == 0) {
                kVar.d |= 2;
            }
            if ((cherry.i & (-1073741824)) == -1073741824) {
                kVar.d |= 4;
            }
            int i6 = kVar.d;
            Mandarin mandarin2 = this.a;
            if (i6 != 0) {
                Cprivate cprivate2 = new Cprivate(str, 2, kVar);
                mandarin2.getClass();
                Mandarin.a(cprivate2);
            } else {
                Cprivate cprivate3 = new Cprivate(str, 1, kVar);
                mandarin2.getClass();
                Mandarin.a(cprivate3);
            }
            a();
        }
    }

    public Cpackage(Looper looper, Mandarin mandarin) {
        super(looper);
        this.b = new ArrayList();
        this.a = mandarin;
    }
}
