package com.inmobi.media;

import android.media.MediaPlayer;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.inmobi.media.AbstractC3892ap;
import com.safedk.android.internal.partials.InMobiVideoBridge;
import defpackage.kc2;
import defpackage.n30;
import defpackage.pv1;
import java.io.IOException;

/* JADX INFO: renamed from: com.inmobi.media.ap, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3892ap {
    /* JADX WARN: Code duplicated, block: B:51:0x0108  */
    /* JADX WARN: Code duplicated, block: B:53:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012e -> B:57:0x0133). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(androidx.media3.exoplayer.ExoPlayer r14, java.util.ArrayList r15, com.inmobi.media.Y9 r16, com.inmobi.media.C4093i3 r17, boolean r18, defpackage.fy r19) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3892ap.a(androidx.media3.exoplayer.ExoPlayer, java.util.ArrayList, com.inmobi.media.Y9, com.inmobi.media.i3, boolean, fy):java.lang.Object");
    }

    public static final void a(MediaPlayer mediaPlayer, final Z9 z9) {
        mediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: jb3
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer2, int i) {
                AbstractC3892ap.a(z9, mediaPlayer2, i);
            }
        });
    }

    public static final void a(Y9 y9, MediaPlayer mediaPlayer, int i) {
        if (y9 != null) {
            ((Z9) y9).a("VideoLoaderHelper", pv1.k(i, "Buffering Percentage: "));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:15:0x003e->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:25:0x007a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(android.media.MediaPlayer r6, java.util.ArrayList r7, com.inmobi.media.Z9 r8, defpackage.fy r9) {
        /*
            boolean r0 = r9 instanceof com.inmobi.media.To
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.To r0 = (com.inmobi.media.To) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.inmobi.media.To r0 = new com.inmobi.media.To
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            java.lang.String r6 = r0.d
            java.util.Iterator r7 = r0.c
            com.inmobi.media.Y9 r8 = r0.b
            android.media.MediaPlayer r1 = r0.a
            defpackage.wz2.a0(r9)
            goto L7a
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.e32.i(r6)
            r6 = 0
            return r6
        L34:
            defpackage.wz2.a0(r9)
            a(r6, r8)
            java.util.Iterator r7 = r7.iterator()
        L3e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r9)
            if (r1 == 0) goto L3e
            if (r8 == 0) goto L60
            java.lang.String r1 = "Video Loading for URL: "
            java.lang.String r1 = defpackage.n30.y(r1, r9)
            r3 = r8
            com.inmobi.media.Z9 r3 = (com.inmobi.media.Z9) r3
            java.lang.String r4 = "VideoLoaderHelper"
            r3.a(r4, r1)
        L60:
            r6.reset()
            r0.a = r6
            r0.b = r8
            r0.c = r7
            r0.d = r9
            r0.f = r2
            java.lang.Object r1 = a(r6, r9, r8, r0)
            dz r3 = defpackage.dz.a
            if (r1 != r3) goto L76
            return r3
        L76:
            r5 = r1
            r1 = r6
            r6 = r9
            r9 = r5
        L7a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L88
            com.inmobi.media.Ro r7 = new com.inmobi.media.Ro
            r7.<init>(r6)
            return r7
        L88:
            r6 = r1
            goto L3e
        L8a:
            com.inmobi.media.No r6 = com.inmobi.media.No.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3892ap.a(android.media.MediaPlayer, java.util.ArrayList, com.inmobi.media.Z9, fy):java.lang.Object");
    }

    public static final Object a(MediaPlayer mediaPlayer, String str, Y9 y9, To to) {
        defpackage.qo qoVar = new defpackage.qo(1, kc2.q(to));
        qoVar.s();
        qoVar.v(new Vo(mediaPlayer));
        try {
            mediaPlayer.setOnPreparedListener(new Wo(y9, str, qoVar));
            mediaPlayer.setOnErrorListener(new Xo(y9, str, qoVar));
            InMobiVideoBridge.MediaPlayerSetDataSource(mediaPlayer, str);
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            if (y9 != null) {
                ((Z9) y9).b("VideoLoaderHelper", n30.y("Video Load Exception: ", e.getMessage()));
            }
            AbstractC4318q5.a(qoVar, Boolean.FALSE);
        } catch (IllegalStateException e2) {
            if (y9 != null) {
                ((Z9) y9).b("VideoLoaderHelper", n30.y("Video Load Exception: ", e2.getMessage()));
            }
            AbstractC4318q5.a(qoVar, Boolean.FALSE);
        }
        return qoVar.r();
    }

    public static final Object a(ExoPlayer exoPlayer, String str, Y9 y9, C4093i3 c4093i3, boolean z, Uo uo) {
        defpackage.qo qoVar = new defpackage.qo(1, kc2.q(uo));
        qoVar.s();
        Zo zo = new Zo(qoVar, c4093i3, str, y9, exoPlayer);
        qoVar.v(new Yo(exoPlayer, zo));
        if (y9 != null) {
            try {
                ((Z9) y9).a("VideoLoaderHelper", "Trying URL with cache " + z + ": " + str);
            } catch (Exception e) {
                if (y9 != null) {
                    ((Z9) y9).b("VideoLoaderHelper", pv1.o("Exception during media source preparation for URL (", str, "): ", e.getMessage()));
                }
                exoPlayer.removeListener(zo);
                if (qoVar.isActive()) {
                    AbstractC4318q5.a(qoVar, new I8(Oo.UNKNOWN));
                }
                InMobiVideoBridge.exoPlayer3Stop(exoPlayer);
                exoPlayer.clearMediaItems();
            }
        }
        MediaSource mediaSourceA = c4093i3.a(str, z);
        exoPlayer.addListener(zo);
        exoPlayer.setMediaSource(mediaSourceA);
        exoPlayer.prepare();
        return qoVar.r();
    }
}
