package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzbhd {
    public final zzbhb a;
    public final int b;
    public final int c;

    public final String a(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        int i;
        boolean z2;
        Collections.sort(arrayList2, new zzbhc());
        HashSet hashSet = new HashSet();
        loop0: for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzbgs) arrayList2.get(i2)).e), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    String str = strArrSplit[i3];
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i4 = 1;
                        boolean z3 = false;
                        while (true) {
                            int i5 = i4 + 2;
                            if (i5 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i4) == '\'') {
                                if (sb.charAt(i4 - 1) != ' ') {
                                    int i6 = i4 + 1;
                                    z2 = true;
                                    if ((sb.charAt(i6) == 's' || sb.charAt(i6) == 'S') && (i5 == sb.length() || sb.charAt(i5) == ' ')) {
                                        sb.insert(i4, ' ');
                                        i4 = i5;
                                    }
                                    z3 = z2;
                                } else {
                                    z2 = true;
                                }
                                sb.setCharAt(i4, ' ');
                                z3 = z2;
                            }
                            i4++;
                        }
                        z = true;
                        String string = z3 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        z = true;
                    }
                    String[] strArrB = zzbgx.b(str, z);
                    int length = strArrB.length;
                    int i7 = this.c;
                    if (length >= i7) {
                        int i8 = 0;
                        while (true) {
                            int length2 = strArrB.length;
                            i = this.b;
                            if (i8 >= length2) {
                                break;
                            }
                            String strConcat = "";
                            for (int i9 = 0; i9 < i7; i9++) {
                                int i10 = i8 + i9;
                                if (i10 >= strArrB.length) {
                                    break;
                                }
                                if (i9 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrB[i10]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= i) {
                                break loop0;
                            }
                            i8++;
                        }
                        if (hashSet.size() >= i) {
                            break loop0;
                        }
                    }
                }
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 10);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                base64OutputStream.write(this.a.b((String) it.next()));
            } catch (IOException e) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        try {
            base64OutputStream.close();
        } catch (IOException e2) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toString();
        } catch (IOException e3) {
            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("HashManager: Unable to convert to Base64.", e3);
            return "";
        }
    }

    public zzbhd(int i, int i2, int i3) {
        this.b = i;
        i2 = (i2 > 64 || i2 < 0) ? 64 : i2;
        if (i3 <= 0) {
            this.c = 1;
        } else {
            this.c = i3;
        }
        this.a = new zzbhb(i2);
    }
}
