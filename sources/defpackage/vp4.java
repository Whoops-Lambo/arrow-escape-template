package defpackage;

import com.google.android.gms.internal.ads.zzgvo;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgwo;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vp4 extends xp4 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp4(zzgwo zzgwoVar, CharSequence charSequence, Object obj, int i) {
        super(zzgwoVar, charSequence);
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.xp4
    public final int a(int i) {
        int i2 = this.h;
        Object obj = this.i;
        switch (i2) {
            case 0:
                CharSequence charSequence = this.c;
                int length = charSequence.length();
                zzgvz.j(i, length);
                while (i < length) {
                    if (((jp4) obj).a(charSequence.charAt(i))) {
                        return i;
                    }
                    i++;
                }
                return -1;
            default:
                Matcher matcher = ((np4) ((zzgvo) obj)).a;
                if (matcher.find(i)) {
                    return matcher.start();
                }
                return -1;
        }
    }

    @Override // defpackage.xp4
    public final int b(int i) {
        switch (this.h) {
            case 0:
                return i + 1;
            default:
                return ((np4) ((zzgvo) this.i)).a.end();
        }
    }
}
