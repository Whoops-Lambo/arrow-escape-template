package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;

/* JADX INFO: renamed from: com.inmobi.media.al, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C3888al extends X6 {
    public final Ed c;
    public final String d;
    public final NativeImage e;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
    
        if (r11 == r2) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.inmobi.media.X6, com.inmobi.media.al] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7, types: [gg0] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.X6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.dy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3888al.a(dy):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3888al(Ed ed, AbstractC4035g1 abstractC4035g1) {
        String type;
        NativeMedia media;
        NativeMedia media2;
        super(ed, abstractC4035g1);
        ed.getClass();
        abstractC4035g1.getClass();
        this.c = ed;
        JsonAssetObject assetsObject = ed.b.getAssetsObject();
        NativeImage image = null;
        if (assetsObject != null && (media2 = assetsObject.getMedia()) != null) {
            type = media2.getType();
        } else {
            type = null;
        }
        this.d = type;
        JsonAssetObject assetsObject2 = ed.b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            image = media.getImage();
        }
        this.e = image;
    }

    public final AbstractC3958d7 a(Exception exc) {
        NativeImage nativeImage = this.e;
        if (nativeImage != null && nativeImage.getRequired()) {
            Y9 y9A = a();
            if (y9A != null) {
                ((Z9) y9A).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new C3874a7((short) 2362);
        }
        return new C3930c7();
    }
}
