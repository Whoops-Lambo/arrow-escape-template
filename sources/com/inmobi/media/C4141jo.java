package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.gg0;
import defpackage.n30;
import defpackage.s71;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.jo, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4141jo extends X6 {
    public final Ed c;
    public final String d;
    public final NativeVideo e;

    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x015c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x014d A[SYNTHETIC] */
    @Override // com.inmobi.media.X6
    public final Object a(dy dyVar) {
        C4058go c4058go;
        Cn cn;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size;
        int i;
        JsonAssetObject assetsObject;
        NativeMedia media;
        List<TrackingInfo> trackers;
        Object objA;
        NativeVideo video;
        Object obj;
        if (dyVar instanceof C4058go) {
            c4058go = (C4058go) dyVar;
            int i2 = c4058go.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4058go.d = i2 - Integer.MIN_VALUE;
            } else {
                c4058go = new C4058go(this, (fy) dyVar);
            }
        } else {
            c4058go = new C4058go(this, (fy) dyVar);
        }
        Object objA2 = c4058go.b;
        int i3 = c4058go.d;
        Object obj2 = dz.a;
        if (i3 == 0) {
            wz2.a0(objA2);
            Y9 y9A = a();
            if (y9A != null) {
                ((Z9) y9A).a("VideoExperienceLoader", n30.y("load called - mediaType: ", this.d));
            }
            if (!s71.b(this.d, "video")) {
                Y9 y9A2 = a();
                if (y9A2 != null) {
                    ((Z9) y9A2).b("VideoExperienceLoader", n30.y("Invalid Media Type - expected VIDEO, got: ", this.d));
                }
                return new C3930c7();
            }
            NativeVideo nativeVideo = this.e;
            if (nativeVideo == null) {
                Y9 y9A3 = a();
                if (y9A3 != null) {
                    ((Z9) y9A3).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                }
                return new C3874a7((short) 2361);
            }
            ArrayList arrayListA = AbstractC3872a5.a("error", nativeVideo.getTrackers());
            String vastTag = this.e.getVastTag();
            c4058go.d = 1;
            objA2 = a(vastTag, arrayListA, c4058go);
            if (objA2 != obj2) {
            }
            return obj2;
        }
        if (i3 == 1) {
            wz2.a0(objA2);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    wz2.a0(objA2);
                    return objA2;
                }
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cn = c4058go.a;
            wz2.a0(objA2);
        }
        String str = cn.a;
        String str2 = cn.b;
        int iA = Vn.a(cn.e);
        arrayList = cn.c;
        arrayList2 = new ArrayList();
        size = arrayList.size();
        i = 0;
        while (i < size) {
            obj = arrayList.get(i);
            i++;
            if (!(((C4493wf) obj) instanceof Bg)) {
                arrayList2.add(obj);
            }
        }
        C4501wn c4501wn = new C4501wn(str, str2, iA, arrayList2);
        String str3 = cn.e;
        ArrayList arrayList3 = cn.f;
        ArrayList arrayList4 = cn.g;
        AdConfig.VastVideoConfig vastVideo = this.c.a.b.a.b.getVastVideo();
        VideoExperience experience = this.e.getExperience();
        C4341r1 c4341r1 = this.c.a.b.a;
        C4003ep c4003ep = new C4003ep(c4341r1.a.g, experience, c4341r1.b.getNative());
        Ed ed = this.c;
        ed.getClass();
        C3951d0 c3951d0 = ed.a.a.d;
        assetsObject = ed.b.getAssetsObject();
        if (assetsObject != null) {
            media = assetsObject.getMedia();
        } else {
            media = null;
        }
        if (media != null || (video = media.getVideo()) == null || (trackers = video.getTrackers()) == null) {
            trackers = gg0.a;
        }
        Co co = new Co(str3, arrayList3, arrayList4, vastVideo, c4003ep, new Yn(c4501wn, c3951d0, new C4449up(trackers)), new Ep(this.c.a.b), new C4482w4(this.c.a.b));
        c4058go.a = null;
        c4058go.d = 3;
        objA = a(c4501wn, co, c4058go);
        if (objA != obj2) {
            return obj2;
        }
        return objA;
        cn = (Cn) objA2;
        if (cn == null) {
            NativeVideo nativeVideo2 = this.e;
            if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                return new C3930c7();
            }
            Y9 y9A4 = a();
            if (y9A4 != null) {
                ((Z9) y9A4).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
            }
            return new C3874a7((short) 2360);
        }
        Ed ed2 = this.c;
        String str4 = cn.d;
        ArrayList arrayList5 = cn.c;
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList5.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj3 = arrayList5.get(i4);
            i4++;
            if (s71.b(((C4493wf) obj3).b, "click")) {
                arrayList6.add(obj3);
            }
        }
        ed2.e = new C4528xn(str4, arrayList6);
        ArrayList arrayList7 = cn.c;
        ArrayList arrayList8 = new ArrayList();
        int size3 = arrayList7.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj4 = arrayList7.get(i5);
            i5++;
            if (obj4 instanceof Bg) {
                arrayList8.add(obj4);
            }
        }
        c4058go.a = cn;
        c4058go.d = 2;
        if (a(arrayList8, c4058go) != obj2) {
            String str5 = cn.a;
            String str6 = cn.b;
            int iA2 = Vn.a(cn.e);
            arrayList = cn.c;
            arrayList2 = new ArrayList();
            size = arrayList.size();
            i = 0;
            while (i < size) {
                obj = arrayList.get(i);
                i++;
                if (!(((C4493wf) obj) instanceof Bg)) {
                    arrayList2.add(obj);
                }
            }
            C4501wn c4501wn2 = new C4501wn(str5, str6, iA2, arrayList2);
            String str7 = cn.e;
            ArrayList arrayList9 = cn.f;
            ArrayList arrayList10 = cn.g;
            AdConfig.VastVideoConfig vastVideo2 = this.c.a.b.a.b.getVastVideo();
            VideoExperience experience2 = this.e.getExperience();
            C4341r1 c4341r2 = this.c.a.b.a;
            C4003ep c4003ep2 = new C4003ep(c4341r2.a.g, experience2, c4341r2.b.getNative());
            Ed ed3 = this.c;
            ed3.getClass();
            C3951d0 c3951d1 = ed3.a.a.d;
            assetsObject = ed3.b.getAssetsObject();
            if (assetsObject != null) {
                media = assetsObject.getMedia();
            } else {
                media = null;
            }
            if (media != null) {
                trackers = gg0.a;
            } else {
                trackers = gg0.a;
            }
            Co co2 = new Co(str7, arrayList9, arrayList10, vastVideo2, c4003ep2, new Yn(c4501wn2, c3951d1, new C4449up(trackers)), new Ep(this.c.a.b), new C4482w4(this.c.a.b));
            c4058go.a = null;
            c4058go.d = 3;
            objA = a(c4501wn2, co2, c4058go);
            if (objA != obj2) {
                return objA;
            }
        }
        return obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4141jo(Ed ed, AbstractC4035g1 abstractC4035g1) {
        NativeMedia media;
        String type;
        super(ed, abstractC4035g1);
        ed.getClass();
        abstractC4035g1.getClass();
        this.c = ed;
        JsonAssetObject assetsObject = ed.b.getAssetsObject();
        if (assetsObject != null) {
            media = assetsObject.getMedia();
        } else {
            media = null;
        }
        if (media != null) {
            type = media.getType();
        } else {
            type = null;
        }
        this.d = type;
        this.e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, ArrayList arrayList, fy fyVar) {
        C4113io c4113io;
        if (fyVar instanceof C4113io) {
            c4113io = (C4113io) fyVar;
            int i = c4113io.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4113io.c = i - Integer.MIN_VALUE;
            } else {
                c4113io = new C4113io(this, fyVar);
            }
        } else {
            c4113io = new C4113io(this, fyVar);
        }
        Object objA = c4113io.a;
        int i2 = c4113io.c;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                Y9 y9A = a();
                if (y9A != null) {
                    ((Z9) y9A).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                }
                Un un = Un.a;
                C4531y c4531y = this.c.a;
                c4113io.c = 1;
                objA = un.a(str, c4531y, arrayList, c4113io);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(objA);
            }
            return (Cn) objA;
        } catch (Fn e) {
            Y9 y9A2 = a();
            if (y9A2 != null) {
                ((Z9) y9A2).b("VideoExperienceLoader", n30.y("parseVastTag - VAST parse exception: ", e.getMessage()));
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C4501wn c4501wn, Co co, fy fyVar) {
        C4086ho c4086ho;
        if (fyVar instanceof C4086ho) {
            c4086ho = (C4086ho) fyVar;
            int i = c4086ho.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4086ho.d = i - Integer.MIN_VALUE;
            } else {
                c4086ho = new C4086ho(this, fyVar);
            }
        } else {
            c4086ho = new C4086ho(this, fyVar);
        }
        Object objA = c4086ho.b;
        int i2 = c4086ho.d;
        try {
            if (i2 == 0) {
                wz2.a0(objA);
                C4186ld c4186ld = (C4186ld) this.c.g.getValue();
                Y9 y9A = a();
                if (y9A != null) {
                    ((Z9) y9A).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                }
                c4086ho.a = c4501wn;
                c4086ho.d = 1;
                objA = c4186ld.a(co, c4086ho);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c4501wn = c4086ho.a;
                wz2.a0(objA);
            }
            return new C3902b7((MediaView) objA, c4501wn);
        } catch (Exception e) {
            Y9 y9A2 = a();
            if (y9A2 != null) {
                ((Z9) y9A2).b("VideoExperienceLoader", n30.y("onPrepareExperienceModelSuccess - exception during media load: ", e.getMessage()));
            }
            return a(e, c4501wn);
        }
    }

    public final AbstractC3958d7 a(Exception exc, C4501wn c4501wn) {
        NativeVideo nativeVideo = this.e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            Y9 y9A = a();
            if (y9A != null) {
                ((Z9) y9A).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new C3874a7((short) 2362);
        }
        return new C3930c7(c4501wn);
    }
}
