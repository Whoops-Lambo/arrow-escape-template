package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzace;
import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvh;
import com.ironsource.M9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.bd4;
import defpackage.je4;
import defpackage.zl3;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzace implements zzaca, zziu {
    public static final w n = zzgzb.z(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final w o = zzgzb.z(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final w p;
    public static final w q;
    public static final w r;
    public static final w s;
    public static zzace t;
    public final Context a;
    public final zzgze b;
    public final zzaby c;
    public final zzacs d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public String m;

    @Override // com.google.android.gms.internal.ads.zziu
    public final synchronized void c(zzia zziaVar, boolean z) {
        boolean z2;
        if (z) {
            zziaVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            zzgvz.f(this.e > 0);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (jElapsedRealtime - this.f);
            this.h += (long) i;
            long j = this.i;
            long j2 = this.g;
            this.i = j + j2;
            if (i > 0) {
                zzacs zzacsVar = this.d;
                zzacsVar.a((j2 * 8000.0f) / i, (int) Math.sqrt(j2));
                if (this.h >= 2000 || this.i >= 524288) {
                    this.j = (long) zzacsVar.b();
                }
                long j3 = this.g;
                long j4 = this.j;
                this.k = j4;
                this.c.a(i, j3, j4);
                this.f = jElapsedRealtime;
                this.g = 0L;
            }
            this.e--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:278:0x040b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0474  */
    /* JADX WARN: Code duplicated, block: B:347:0x0512  */
    /* JADX WARN: Code duplicated, block: B:416:0x062c  */
    /* JADX WARN: Code duplicated, block: B:437:0x0681  */
    /* JADX WARN: Code duplicated, block: B:443:0x0698  */
    /* JADX WARN: Code duplicated, block: B:449:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:473:0x0713  */
    /* JADX WARN: Code duplicated, block: B:479:0x072d  */
    /* JADX WARN: Code duplicated, block: B:497:0x0775  */
    /* JADX WARN: Code duplicated, block: B:512:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:530:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:536:0x0812  */
    /* JADX WARN: Code duplicated, block: B:566:0x0888  */
    /* JADX WARN: Code duplicated, block: B:569:0x0895  */
    /* JADX WARN: Code duplicated, block: B:611:0x0941  */
    /* JADX WARN: Code duplicated, block: B:629:0x0989  */
    /* JADX WARN: Code duplicated, block: B:656:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:659:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:665:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:668:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:677:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:680:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:683:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:692:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:698:0x0aaf  */
    /* JADX WARN: Code duplicated, block: B:701:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:728:0x0b2a  */
    /* JADX WARN: Code duplicated, block: B:731:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:734:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:743:0x0b67  */
    /* JADX WARN: Code duplicated, block: B:749:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:752:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:755:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:761:0x0baf  */
    /* JADX WARN: Code duplicated, block: B:765:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:784:0x0c2a  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 int, still in use, count: 24, list:
  (r0v3 int) from 0x0038: IF  (r0v3 int) != (2091 int)  -> B:12:0x003a A[HIDDEN]
  (r0v3 int) from 0x003c: IF  (r0v3 int) != (2092 int)  -> B:14:0x003e A[HIDDEN]
  (r0v3 int) from 0x0040: IF  (r0v3 int) != (2102 int)  -> B:16:0x0042 A[HIDDEN]
  (r0v3 int) from 0x0044: IF  (r0v3 int) != (2103 int)  -> B:18:0x0046 A[HIDDEN]
  (r0v3 int) from 0x0048: IF  (r0v3 int) != (2111 int)  -> B:20:0x004a A[HIDDEN]
  (r0v3 int) from 0x004c: IF  (r0v3 int) != (2112 int)  -> B:22:0x004e A[HIDDEN]
  (r0v3 int) from 0x0050: IF  (r0v3 int) != (2135 int)  -> B:24:0x0052 A[HIDDEN]
  (r0v3 int) from 0x0054: IF  (r0v3 int) != (2136 int)  -> B:26:0x0056 A[HIDDEN]
  (r0v3 int) from 0x0056: SWITCH (r0v3 int)
 case 2083: goto B:738:0x0b56
 case 2084: goto B:735:0x0b49
 case 2085: goto B:732:0x0b3c
 case 2086: goto B:729:0x0b2f
 default: goto B:27:0x0059 A[RegionRef:SW:26]
  (r0v3 int) from 0x005b: IF  (r0v3 int) == (2182 int)  -> B:726:0x0b22 A[HIDDEN]
  (r0v3 int) from 0x005f: IF  (r0v3 int) == (2183 int)  -> B:723:0x0b15 A[HIDDEN]
  (r0v3 int) from 0x0063: IF  (r0v3 int) == (2266 int)  -> B:720:0x0b08 A[HIDDEN]
  (r0v3 int) from 0x0067: IF  (r0v3 int) == (2267 int)  -> B:717:0x0afb A[HIDDEN]
  (r0v3 int) from 0x0069: SWITCH (r0v3 int)
 case 2088: goto B:714:0x0af1
 case 2094: goto B:711:0x0ae4
 case 2105: goto B:708:0x0adb
 case 2114: goto B:705:0x0ace
 case 2115: goto B:702:0x0ac1
 case 2116: goto B:699:0x0ab4
 case 2117: goto B:696:0x0aa7
 case 2118: goto B:693:0x0a9a
 case 2119: goto B:690:0x0a8d
 case 2120: goto B:687:0x0a80
 case 2133: goto B:684:0x0a73
 case 2142: goto B:681:0x0a66
 case 2145: goto B:678:0x0a59
 case 2159: goto B:675:0x0a4c
 case 2177: goto B:672:0x0a3f
 case 2185: goto B:669:0x0a35
 case 2187: goto B:666:0x0a28
 case 2198: goto B:663:0x0a1b
 case 2206: goto B:660:0x0a0e
 case 2208: goto B:657:0x0a02
 case 2210: goto B:654:0x09f5
 case 2247: goto B:651:0x09e8
 case 2249: goto B:648:0x09db
 case 2252: goto B:645:0x09ce
 case 2285: goto B:642:0x09c1
 case 2286: goto B:639:0x09b4
 case 2288: goto B:636:0x09a7
 case 2290: goto B:633:0x099a
 case 2307: goto B:630:0x098e
 case 2314: goto B:627:0x0981
 case 2316: goto B:624:0x0977
 case 2317: goto B:621:0x096d
 case 2331: goto B:618:0x0960
 case 2332: goto B:615:0x0953
 case 2339: goto B:612:0x0946
 case 2340: goto B:609:0x0939
 case 2341: goto B:606:0x092c
 case 2342: goto B:603:0x091f
 case 2344: goto B:600:0x0912
 case 2345: goto B:597:0x0905
 case 2346: goto B:594:0x08fb
 case 2347: goto B:591:0x08ee
 case 2363: goto B:588:0x08e5
 case 2371: goto B:585:0x08d8
 case 2373: goto B:582:0x08ce
 case 2374: goto B:579:0x08c1
 case 2394: goto B:576:0x08b4
 case 2396: goto B:573:0x08a7
 case 2397: goto B:570:0x089a
 case 2398: goto B:567:0x088d
 case 2402: goto B:564:0x0880
 case 2403: goto B:561:0x0876
 case 2407: goto B:558:0x0869
 case 2412: goto B:555:0x085f
 case 2414: goto B:552:0x0855
 case 2415: goto B:549:0x0848
 case 2421: goto B:546:0x083b
 case 2422: goto B:543:0x082e
 case 2423: goto B:540:0x0821
 case 2429: goto B:537:0x0817
 case 2431: goto B:534:0x080a
 case 2438: goto B:531:0x0800
 case 2439: goto B:528:0x07f3
 case 2440: goto B:525:0x07e6
 case 2441: goto B:522:0x07d9
 case 2442: goto B:519:0x07cf
 case 2445: goto B:516:0x07c5
 case 2452: goto B:513:0x07b8
 case 2454: goto B:510:0x07ab
 case 2455: goto B:507:0x079e
 case 2456: goto B:504:0x0791
 case 2457: goto B:501:0x0784
 case 2458: goto B:498:0x077a
 case 2459: goto B:495:0x076d
 case 2462: goto B:492:0x0760
 case 2463: goto B:489:0x0756
 case 2464: goto B:486:0x074c
 case 2465: goto B:483:0x073f
 case 2466: goto B:480:0x0732
 case 2467: goto B:477:0x0725
 case 2468: goto B:474:0x0718
 case 2469: goto B:471:0x070b
 case 2470: goto B:468:0x0701
 case 2471: goto B:465:0x06f7
 case 2472: goto B:462:0x06ea
 case 2473: goto B:459:0x06dd
 case 2474: goto B:456:0x06d0
 case 2475: goto B:453:0x06c3
 case 2476: goto B:450:0x06b7
 case 2477: goto B:447:0x06aa
 case 2483: goto B:444:0x069d
 case 2485: goto B:441:0x0690
 case 2487: goto B:438:0x0686
 case 2488: goto B:435:0x0679
 case 2489: goto B:432:0x066c
 case 2491: goto B:429:0x0662
 case 2494: goto B:426:0x0655
 case 2497: goto B:423:0x0648
 case 2498: goto B:420:0x063b
 case 2500: goto B:417:0x0631
 case 2503: goto B:414:0x0624
 case 2508: goto B:411:0x0617
 case 2526: goto B:408:0x060a
 case 2545: goto B:405:0x0600
 case 2549: goto B:402:0x05f3
 case 2550: goto B:399:0x05e6
 case 2551: goto B:396:0x05dc
 case 2552: goto B:393:0x05cf
 case 2555: goto B:390:0x05c2
 case 2556: goto B:387:0x05b5
 case 2557: goto B:384:0x05ab
 case 2562: goto B:381:0x059f
 case 2563: goto B:378:0x0592
 case 2564: goto B:375:0x0588
 case 2567: goto B:372:0x057b
 case 2569: goto B:369:0x0571
 case 2576: goto B:366:0x0564
 case 2611: goto B:363:0x0557
 case 2621: goto B:360:0x054a
 case 2625: goto B:357:0x053d
 case 2627: goto B:354:0x0530
 case 2629: goto B:351:0x0523
 case 2638: goto B:348:0x0517
 case 2639: goto B:345:0x050a
 case 2640: goto B:342:0x0500
 case 2641: goto B:339:0x04f6
 case 2642: goto B:336:0x04ec
 case 2644: goto B:333:0x04df
 case 2645: goto B:330:0x04d5
 case 2646: goto B:327:0x04cb
 case 2647: goto B:324:0x04c1
 case 2648: goto B:321:0x04b4
 case 2649: goto B:318:0x04aa
 case 2650: goto B:315:0x04a0
 case 2651: goto B:312:0x0493
 case 2652: goto B:309:0x0486
 case 2655: goto B:306:0x0479
 case 2656: goto B:303:0x046c
 case 2657: goto B:300:0x045f
 case 2659: goto B:297:0x0452
 case 2661: goto B:294:0x0448
 case 2662: goto B:291:0x043e
 case 2663: goto B:288:0x0434
 case 2671: goto B:285:0x0427
 case 2672: goto B:282:0x041d
 case 2675: goto B:279:0x0410
 case 2676: goto B:276:0x0403
 case 2678: goto B:273:0x03f9
 case 2680: goto B:270:0x03ef
 case 2681: goto B:267:0x03e5
 case 2682: goto B:264:0x03d8
 case 2683: goto B:261:0x03cb
 case 2686: goto B:258:0x03c1
 case 2688: goto B:255:0x03b4
 case 2690: goto B:252:0x03aa
 case 2691: goto B:249:0x03a0
 case 2694: goto B:246:0x0393
 case 2700: goto B:243:0x0389
 case 2706: goto B:240:0x037c
 case 2718: goto B:237:0x036f
 case 2724: goto B:234:0x0362
 case 2725: goto B:231:0x0355
 case 2731: goto B:228:0x034b
 case 2733: goto B:225:0x0341
 case 2735: goto B:222:0x0337
 case 2737: goto B:219:0x032a
 case 2739: goto B:216:0x031d
 case 2744: goto B:213:0x0310
 case 2751: goto B:210:0x0306
 case 2767: goto B:207:0x02fc
 case 2780: goto B:204:0x02f2
 case 2803: goto B:201:0x02e5
 case 2828: goto B:198:0x02db
 case 2843: goto B:195:0x02d1
 case 2855: goto B:192:0x02c4
 case 2867: goto B:189:0x02b7
 case 2877: goto B:186:0x02ad
 default: goto B:36:0x006c A[RegionRef:SW:35]
  (r0v3 int) from 0x006f: SWITCH (r0v3 int)
 case 2162: goto B:168:0x026b
 case 2163: goto B:165:0x025e
 case 2164: goto B:162:0x0254
 case 2165: goto B:159:0x024a
 case 2166: goto B:156:0x023d
 case 2167: goto B:153:0x0230
 default: goto B:38:0x0072 A[RegionRef:SW:37]
  (r0v3 int) from 0x0072: SWITCH (r0v3 int)
 case 2221: goto B:150:0x0226
 case 2222: goto B:147:0x021a
 case 2223: goto B:144:0x020d
 default: goto B:39:0x0075 A[RegionRef:SW:38]
  (r0v3 int) from 0x0075: SWITCH (r0v3 int)
 case 2243: goto B:141:0x0200
 case 2244: goto B:138:0x01f3
 case 2245: goto B:135:0x01e9
 default: goto B:40:0x0078 A[RegionRef:SW:39]
  (r0v3 int) from 0x0078: SWITCH (r0v3 int)
 case 2269: goto B:132:0x01dc
 case 2270: goto B:129:0x01cf
 case 2271: goto B:126:0x01c2
 case 2272: goto B:123:0x01b5
 case 2273: goto B:120:0x01a8
 case 2274: goto B:117:0x019e
 default: goto B:41:0x007b A[RegionRef:SW:40]
  (r0v3 int) from 0x007b: SWITCH (r0v3 int)
 case 2277: goto B:114:0x0194
 case 2278: goto B:111:0x018a
 case 2279: goto B:108:0x017d
 default: goto B:42:0x007e A[RegionRef:SW:41]
  (r0v3 int) from 0x007e: SWITCH (r0v3 int)
 case 2281: goto B:105:0x0170
 case 2282: goto B:102:0x0166
 case 2283: goto B:99:0x0159
 default: goto B:43:0x0081 A[RegionRef:SW:42]
  (r0v3 int) from 0x0081: SWITCH (r0v3 int)
 case 2096: goto B:96:0x014f
 case 2097: goto B:93:0x0142
 case 2098: goto B:90:0x0135
 case 2099: goto B:87:0x012b
 case 2100: goto B:84:0x011f
 default: goto B:44:0x0084 A[RegionRef:SW:43]
  (r0v3 int) from 0x0084: SWITCH (r0v3 int)
 case 2122: goto B:81:0x0115
 case 2123: goto B:78:0x0108
 case 2124: goto B:75:0x00fb
 case 2125: goto B:72:0x00ee
 default: goto B:45:0x0087 A[RegionRef:SW:44]
  (r0v3 int) from 0x0087: SWITCH (r0v3 int)
 case 2127: goto B:69:0x00e4
 case 2128: goto B:66:0x00d7
 case 2129: goto B:63:0x00ca
 case 2130: goto B:60:0x00bd
 default: goto B:46:0x008a A[RegionRef:SW:45]
  (r0v3 int) from 0x008a: SWITCH (r0v3 int)
 case 2147: goto B:57:0x00b0
 case 2148: goto B:54:0x00a6
 case 2149: goto B:51:0x0099
 case 2150: goto B:48:0x008f
 default: goto B:765:0x0bbf A[RegionRef:SW:46]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final long d(int i) {
        long jLongValue;
        Integer numValueOf = Integer.valueOf(i);
        zzgze zzgzeVar = this.b;
        Long lValueOf = (Long) zzgzeVar.get(numValueOf);
        int i2 = 0;
        if (lValueOf == null) {
            lValueOf = (Long) zzgzeVar.get(0);
        } else if (lValueOf.longValue() == -9223372036854775807L) {
            String str = this.m;
            if (str == null) {
                str = "";
            }
            if (iHashCode != 2091) {
                if (iHashCode != 2092) {
                    if (iHashCode != 2102) {
                        if (iHashCode != 2103) {
                            if (iHashCode != 2111) {
                                if (iHashCode != 2112) {
                                    if (iHashCode != 2135) {
                                        if (iHashCode != 2136) {
                                            switch (iHashCode) {
                                                case 2083:
                                                    if (!str.equals("AD")) {
                                                        i2 = 74898;
                                                    } else {
                                                        i2 = 73745;
                                                    }
                                                    break;
                                                case 2084:
                                                    if (!str.equals("AE")) {
                                                        i2 = 74898;
                                                    } else {
                                                        i2 = 50849;
                                                    }
                                                    break;
                                                case 2085:
                                                    if (!str.equals("AF")) {
                                                        i2 = 74898;
                                                    } else {
                                                        i2 = 76004;
                                                    }
                                                    break;
                                                case 2086:
                                                    if (!str.equals("AG")) {
                                                        i2 = 74898;
                                                    } else {
                                                        i2 = 76002;
                                                    }
                                                    break;
                                                default:
                                                    if (iHashCode != 2182) {
                                                        if (iHashCode != 2183) {
                                                            if (iHashCode != 2266) {
                                                                if (iHashCode != 2267) {
                                                                    switch (iHashCode) {
                                                                        case 2088:
                                                                            if (!str.equals("AI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73745;
                                                                            }
                                                                            break;
                                                                        case 2094:
                                                                            if (!str.equals("AO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75555;
                                                                            }
                                                                            break;
                                                                        case 2105:
                                                                            if (!str.equals("AZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75476;
                                                                            }
                                                                            break;
                                                                        case 2114:
                                                                            if (!str.equals("BD")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83146;
                                                                            }
                                                                            break;
                                                                        case 2115:
                                                                            if (!str.equals("BE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 69696;
                                                                            }
                                                                            break;
                                                                        case 2116:
                                                                            if (!str.equals("BF")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76060;
                                                                            }
                                                                            break;
                                                                        case 2117:
                                                                            if (!str.equals("BG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 69632;
                                                                            }
                                                                            break;
                                                                        case 2118:
                                                                            if (!str.equals("BH")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83545;
                                                                            }
                                                                            break;
                                                                        case 2119:
                                                                            if (!str.equals("BI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76068;
                                                                            }
                                                                            break;
                                                                        case 2120:
                                                                            if (!str.equals("BJ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75428;
                                                                            }
                                                                            break;
                                                                        case 2133:
                                                                            if (!str.equals("BW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73811;
                                                                            }
                                                                            break;
                                                                        case 2142:
                                                                            if (!str.equals("CA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 111696;
                                                                            }
                                                                            break;
                                                                        case 2145:
                                                                            if (!str.equals("CD")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74907;
                                                                            }
                                                                            break;
                                                                        case 2159:
                                                                            if (!str.equals("CR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76066;
                                                                            }
                                                                            break;
                                                                        case 2177:
                                                                            if (!str.equals("DE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 42248;
                                                                            }
                                                                            break;
                                                                        case 2185:
                                                                            if (!str.equals("DM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73745;
                                                                            }
                                                                            break;
                                                                        case 2187:
                                                                            if (!str.equals("DO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76067;
                                                                            }
                                                                            break;
                                                                        case 2198:
                                                                            if (!str.equals("DZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76059;
                                                                            }
                                                                            break;
                                                                        case 2206:
                                                                            if (!str.equals("EC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74393;
                                                                            }
                                                                            break;
                                                                        case 2208:
                                                                            if (!str.equals("EE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65536;
                                                                            }
                                                                            break;
                                                                        case M9.a.e /* 2210 */:
                                                                            if (!str.equals("EG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75491;
                                                                            }
                                                                            break;
                                                                        case 2247:
                                                                            if (!str.equals("FM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74004;
                                                                            }
                                                                            break;
                                                                        case 2249:
                                                                            if (!str.equals("FO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73872;
                                                                            }
                                                                            break;
                                                                        case 2252:
                                                                            if (!str.equals("FR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 66121;
                                                                            }
                                                                            break;
                                                                        case 2285:
                                                                            if (!str.equals("GT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74378;
                                                                            }
                                                                            break;
                                                                        case 2286:
                                                                            if (!str.equals("GU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 79634;
                                                                            }
                                                                            break;
                                                                        case 2288:
                                                                            if (!str.equals("GW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74852;
                                                                            }
                                                                            break;
                                                                        case 2290:
                                                                            if (!str.equals("GY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75339;
                                                                            }
                                                                            break;
                                                                        case 2307:
                                                                            if (!str.equals("HK")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 4616;
                                                                            }
                                                                            break;
                                                                        case 2314:
                                                                            if (!str.equals("HR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65537;
                                                                            }
                                                                            break;
                                                                        case 2316:
                                                                            if (!str.equals("HT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76068;
                                                                            }
                                                                            break;
                                                                        case 2317:
                                                                            if (!str.equals("HU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65536;
                                                                            }
                                                                            break;
                                                                        case 2331:
                                                                            if (!str.equals("ID")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 141003;
                                                                            }
                                                                            break;
                                                                        case 2332:
                                                                            if (!str.equals("IE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 70217;
                                                                            }
                                                                            break;
                                                                        case 2339:
                                                                            if (!str.equals("IL")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83601;
                                                                            }
                                                                            break;
                                                                        case 2340:
                                                                            if (!str.equals("IM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74256;
                                                                            }
                                                                            break;
                                                                        case 2341:
                                                                            if (!str.equals("IN")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 107721;
                                                                            }
                                                                            break;
                                                                        case 2342:
                                                                            if (!str.equals("IO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73875;
                                                                            }
                                                                            break;
                                                                        case 2344:
                                                                            if (!str.equals("IQ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74963;
                                                                            }
                                                                            break;
                                                                        case 2345:
                                                                            if (!str.equals("IR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 116436;
                                                                            }
                                                                            break;
                                                                        case 2346:
                                                                            if (!str.equals(IronSourceConstants.INTERSTITIAL_EVENT_TYPE)) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65536;
                                                                            }
                                                                            break;
                                                                        case 2347:
                                                                            if (!str.equals("IT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 70728;
                                                                            }
                                                                            break;
                                                                        case 2363:
                                                                            if (!str.equals("JE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74256;
                                                                            }
                                                                            break;
                                                                        case 2371:
                                                                            if (!str.equals("JM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74466;
                                                                            }
                                                                            break;
                                                                        case 2373:
                                                                            if (!str.equals("JO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74313;
                                                                            }
                                                                            break;
                                                                        case 2374:
                                                                            if (!str.equals("JP")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83608;
                                                                            }
                                                                            break;
                                                                        case 2394:
                                                                            if (!str.equals("KE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 70227;
                                                                            }
                                                                            break;
                                                                        case 2396:
                                                                            if (!str.equals("KG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74826;
                                                                            }
                                                                            break;
                                                                        case 2397:
                                                                            if (!str.equals("KH")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75009;
                                                                            }
                                                                            break;
                                                                        case 2398:
                                                                            if (!str.equals("KI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76052;
                                                                            }
                                                                            break;
                                                                        case 2402:
                                                                            if (!str.equals("KM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74972;
                                                                            }
                                                                            break;
                                                                        case 2403:
                                                                            if (!str.equals("KN")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73745;
                                                                            }
                                                                            break;
                                                                        case 2407:
                                                                            if (!str.equals("KR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 149648;
                                                                            }
                                                                            break;
                                                                        case 2412:
                                                                            if (!str.equals("KW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65537;
                                                                            }
                                                                            break;
                                                                        case 2414:
                                                                            if (!str.equals("KY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73745;
                                                                            }
                                                                            break;
                                                                        case 2415:
                                                                            if (!str.equals("KZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 78986;
                                                                            }
                                                                            break;
                                                                        case 2421:
                                                                            if (!str.equals("LA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75345;
                                                                            }
                                                                            break;
                                                                        case 2422:
                                                                            if (!str.equals("LB")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74827;
                                                                            }
                                                                            break;
                                                                        case 2423:
                                                                            if (!str.equals("LC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74322;
                                                                            }
                                                                            break;
                                                                        case 2429:
                                                                            if (!str.equals("LI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74896;
                                                                            }
                                                                            break;
                                                                        case 2431:
                                                                            if (!str.equals("LK")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83667;
                                                                            }
                                                                            break;
                                                                        case 2438:
                                                                            if (!str.equals("LR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76067;
                                                                            }
                                                                            break;
                                                                        case 2439:
                                                                            if (!str.equals("LS")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75484;
                                                                            }
                                                                            break;
                                                                        case 2440:
                                                                            if (!str.equals("LT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 66056;
                                                                            }
                                                                            break;
                                                                        case 2441:
                                                                            if (!str.equals("LU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 103620;
                                                                            }
                                                                            break;
                                                                        case 2442:
                                                                            if (!str.equals("LV")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65536;
                                                                            }
                                                                            break;
                                                                        case 2445:
                                                                            if (!str.equals("LY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75476;
                                                                            }
                                                                            break;
                                                                        case 2452:
                                                                            if (!str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74331;
                                                                            }
                                                                            break;
                                                                        case 2454:
                                                                            if (!str.equals("MC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73873;
                                                                            }
                                                                            break;
                                                                        case 2455:
                                                                            if (!str.equals("MD")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73729;
                                                                            }
                                                                            break;
                                                                        case 2456:
                                                                            if (!str.equals("ME")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 78338;
                                                                            }
                                                                            break;
                                                                        case 2457:
                                                                            if (!str.equals("MF")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75409;
                                                                            }
                                                                            break;
                                                                        case 2458:
                                                                            if (!str.equals("MG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75491;
                                                                            }
                                                                            break;
                                                                        case 2459:
                                                                            if (!str.equals("MH")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75924;
                                                                            }
                                                                            break;
                                                                        case 2462:
                                                                            if (!str.equals("MK")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 78337;
                                                                            }
                                                                            break;
                                                                        case 2463:
                                                                            if (!str.equals("ML")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74907;
                                                                            }
                                                                            break;
                                                                        case 2464:
                                                                            if (!str.equals("MM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83667;
                                                                            }
                                                                            break;
                                                                        case 2465:
                                                                            if (!str.equals("MN")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74882;
                                                                            }
                                                                            break;
                                                                        case 2466:
                                                                            if (!str.equals("MO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 47376;
                                                                            }
                                                                            break;
                                                                        case 2467:
                                                                            if (!str.equals("MP")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74897;
                                                                            }
                                                                            break;
                                                                        case 2468:
                                                                            if (!str.equals("MQ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75402;
                                                                            }
                                                                            break;
                                                                        case 2469:
                                                                            if (!str.equals("MR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75996;
                                                                            }
                                                                            break;
                                                                        case 2470:
                                                                            if (!str.equals("MS")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74896;
                                                                            }
                                                                            break;
                                                                        case 2471:
                                                                            if (!str.equals("MT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65536;
                                                                            }
                                                                            break;
                                                                        case 2472:
                                                                            if (!str.equals("MU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74763;
                                                                            }
                                                                            break;
                                                                        case 2473:
                                                                            if (!str.equals("MV")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83539;
                                                                            }
                                                                            break;
                                                                        case 2474:
                                                                            if (!str.equals("MW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74387;
                                                                            }
                                                                            break;
                                                                        case 2475:
                                                                            if (!str.equals("MX")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 80162;
                                                                            }
                                                                            break;
                                                                        case 2476:
                                                                            if (!str.equals("MY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 4865;
                                                                            }
                                                                            break;
                                                                        case 2477:
                                                                            if (!str.equals("MZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74891;
                                                                            }
                                                                            break;
                                                                        case 2483:
                                                                            if (!str.equals("NA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74979;
                                                                            }
                                                                            break;
                                                                        case 2485:
                                                                            if (!str.equals("NC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75994;
                                                                            }
                                                                            break;
                                                                        case 2487:
                                                                            if (!str.equals("NE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76068;
                                                                            }
                                                                            break;
                                                                        case 2488:
                                                                            if (!str.equals("NF")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74899;
                                                                            }
                                                                            break;
                                                                        case 2489:
                                                                            if (!str.equals("NG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74403;
                                                                            }
                                                                            break;
                                                                        case 2491:
                                                                            if (!str.equals("NI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76066;
                                                                            }
                                                                            break;
                                                                        case 2494:
                                                                            if (!str.equals("NL")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 132874;
                                                                            }
                                                                            break;
                                                                        case 2497:
                                                                            if (!str.equals("NO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65728;
                                                                            }
                                                                            break;
                                                                        case 2498:
                                                                            if (!str.equals("NP")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75538;
                                                                            }
                                                                            break;
                                                                        case 2500:
                                                                            if (!str.equals("NR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76052;
                                                                            }
                                                                            break;
                                                                        case M9.b.e /* 2503 */:
                                                                            if (!str.equals("NU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74900;
                                                                            }
                                                                            break;
                                                                        case 2508:
                                                                            if (!str.equals("NZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83008;
                                                                            }
                                                                            break;
                                                                        case 2526:
                                                                            if (!str.equals("OM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83034;
                                                                            }
                                                                            break;
                                                                        case 2545:
                                                                            if (!str.equals("PA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75418;
                                                                            }
                                                                            break;
                                                                        case 2549:
                                                                            if (!str.equals("PE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 80145;
                                                                            }
                                                                            break;
                                                                        case 2550:
                                                                            if (!str.equals("PF")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74450;
                                                                            }
                                                                            break;
                                                                        case 2551:
                                                                            if (!str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75484;
                                                                            }
                                                                            break;
                                                                        case 2552:
                                                                            if (!str.equals("PH")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 42634;
                                                                            }
                                                                            break;
                                                                        case 2555:
                                                                            if (!str.equals("PK")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75483;
                                                                            }
                                                                            break;
                                                                        case 2556:
                                                                            if (!str.equals("PL")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 148609;
                                                                            }
                                                                            break;
                                                                        case 2557:
                                                                            if (!str.equals("PM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74896;
                                                                            }
                                                                            break;
                                                                        case 2562:
                                                                            if (!str.equals("PR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 8834;
                                                                            }
                                                                            break;
                                                                        case 2563:
                                                                            if (!str.equals("PS")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75363;
                                                                            }
                                                                            break;
                                                                        case 2564:
                                                                            if (!str.equals("PT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 69632;
                                                                            }
                                                                            break;
                                                                        case 2567:
                                                                            if (!str.equals("PW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74514;
                                                                            }
                                                                            break;
                                                                        case 2569:
                                                                            if (!str.equals("PY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74897;
                                                                            }
                                                                            break;
                                                                        case 2576:
                                                                            if (!str.equals("QA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 84257;
                                                                            }
                                                                            break;
                                                                        case 2611:
                                                                            if (!str.equals("RE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 71320;
                                                                            }
                                                                            break;
                                                                        case 2621:
                                                                            if (!str.equals("RO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 78400;
                                                                            }
                                                                            break;
                                                                        case 2625:
                                                                            if (!str.equals("RS")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74241;
                                                                            }
                                                                            break;
                                                                        case 2627:
                                                                            if (!str.equals("RU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 111105;
                                                                            }
                                                                            break;
                                                                        case 2629:
                                                                            if (!str.equals("RW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73883;
                                                                            }
                                                                            break;
                                                                        case 2638:
                                                                            if (!str.equals("SA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 9291;
                                                                            }
                                                                            break;
                                                                        case 2639:
                                                                            if (!str.equals("SB")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75540;
                                                                            }
                                                                            break;
                                                                        case 2640:
                                                                            if (!str.equals("SC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74900;
                                                                            }
                                                                            break;
                                                                        case 2641:
                                                                            if (!str.equals("SD")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76060;
                                                                            }
                                                                            break;
                                                                        case 2642:
                                                                            if (!str.equals("SE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 65536;
                                                                            }
                                                                            break;
                                                                        case 2644:
                                                                            if (!str.equals("SG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 38618;
                                                                            }
                                                                            break;
                                                                        case 2645:
                                                                            if (!str.equals("SH")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74900;
                                                                            }
                                                                            break;
                                                                        case 2646:
                                                                            if (!str.equals("SI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 69632;
                                                                            }
                                                                            break;
                                                                        case 2647:
                                                                            if (!str.equals("SJ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74899;
                                                                            }
                                                                            break;
                                                                        case 2648:
                                                                            if (!str.equals("SK")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74312;
                                                                            }
                                                                            break;
                                                                        case 2649:
                                                                            if (!str.equals("SL")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75476;
                                                                            }
                                                                            break;
                                                                        case 2650:
                                                                            if (!str.equals("SM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74896;
                                                                            }
                                                                            break;
                                                                        case 2651:
                                                                            if (!str.equals("SN")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74980;
                                                                            }
                                                                            break;
                                                                        case 2652:
                                                                            if (!str.equals("SO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 84178;
                                                                            }
                                                                            break;
                                                                        case 2655:
                                                                            if (!str.equals("SR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74530;
                                                                            }
                                                                            break;
                                                                        case 2656:
                                                                            if (!str.equals("SS")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75932;
                                                                            }
                                                                            break;
                                                                        case 2657:
                                                                            if (!str.equals("ST")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74834;
                                                                            }
                                                                            break;
                                                                        case 2659:
                                                                            if (!str.equals("SV")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74394;
                                                                            }
                                                                            break;
                                                                        case 2661:
                                                                            if (!str.equals("SX")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73745;
                                                                            }
                                                                            break;
                                                                        case 2662:
                                                                            if (!str.equals("SY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76060;
                                                                            }
                                                                            break;
                                                                        case 2663:
                                                                            if (!str.equals("SZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76004;
                                                                            }
                                                                            break;
                                                                        case 2671:
                                                                            if (!str.equals("TC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74835;
                                                                            }
                                                                            break;
                                                                        case 2672:
                                                                            if (!str.equals("TD")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76060;
                                                                            }
                                                                            break;
                                                                        case 2675:
                                                                            if (!str.equals("TG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73827;
                                                                            }
                                                                            break;
                                                                        case 2676:
                                                                            if (!str.equals("TH")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74888;
                                                                            }
                                                                            break;
                                                                        case 2678:
                                                                            if (!str.equals("TJ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76059;
                                                                            }
                                                                            break;
                                                                        case 2680:
                                                                            if (!str.equals("TL")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76052;
                                                                            }
                                                                            break;
                                                                        case 2681:
                                                                            if (!str.equals("TM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75924;
                                                                            }
                                                                            break;
                                                                        case 2682:
                                                                            if (!str.equals("TN")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74315;
                                                                            }
                                                                            break;
                                                                        case 2683:
                                                                            if (!str.equals("TO")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75539;
                                                                            }
                                                                            break;
                                                                        case 2686:
                                                                            if (!str.equals("TR")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74313;
                                                                            }
                                                                            break;
                                                                        case 2688:
                                                                            if (!str.equals("TT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73826;
                                                                            }
                                                                            break;
                                                                        case 2690:
                                                                            if (!str.equals("TV")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75924;
                                                                            }
                                                                            break;
                                                                        case 2691:
                                                                            if (!str.equals("TW")) {
                                                                                i2 = 74898;
                                                                            }
                                                                            break;
                                                                        case 2694:
                                                                            if (!str.equals("TZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 78499;
                                                                            }
                                                                            break;
                                                                        case 2700:
                                                                            if (!str.equals("UA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 111696;
                                                                            }
                                                                            break;
                                                                        case 2706:
                                                                            if (!str.equals("UG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 83611;
                                                                            }
                                                                            break;
                                                                        case 2718:
                                                                            if (!str.equals("US")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 45842;
                                                                            }
                                                                            break;
                                                                        case 2724:
                                                                            if (!str.equals("UY")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 70730;
                                                                            }
                                                                            break;
                                                                        case 2725:
                                                                            if (!str.equals("UZ")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 80081;
                                                                            }
                                                                            break;
                                                                        case 2731:
                                                                            if (!str.equals("VA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74896;
                                                                            }
                                                                            break;
                                                                        case 2733:
                                                                            if (!str.equals("VC")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 73745;
                                                                            }
                                                                            break;
                                                                        case 2735:
                                                                            if (!str.equals("VE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76068;
                                                                            }
                                                                            break;
                                                                        case 2737:
                                                                            if (!str.equals("VG")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 139858;
                                                                            }
                                                                            break;
                                                                        case 2739:
                                                                            if (!str.equals("VI")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74832;
                                                                            }
                                                                            break;
                                                                        case 2744:
                                                                            if (!str.equals("VN")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74816;
                                                                            }
                                                                            break;
                                                                        case 2751:
                                                                            if (!str.equals("VU")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74972;
                                                                            }
                                                                            break;
                                                                        case 2767:
                                                                            if (!str.equals("WF")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75924;
                                                                            }
                                                                            break;
                                                                        case 2780:
                                                                            if (!str.equals("WS")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74891;
                                                                            }
                                                                            break;
                                                                        case 2803:
                                                                            if (!str.equals("XK")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 74321;
                                                                            }
                                                                            break;
                                                                        case 2828:
                                                                            if (!str.equals("YE")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 76068;
                                                                            }
                                                                            break;
                                                                        case 2843:
                                                                            if (!str.equals("YT")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75994;
                                                                            }
                                                                            break;
                                                                        case 2855:
                                                                            if (!str.equals("ZA")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 70306;
                                                                            }
                                                                            break;
                                                                        case 2867:
                                                                            if (!str.equals("ZM")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75556;
                                                                            }
                                                                            break;
                                                                        case 2877:
                                                                            if (!str.equals("ZW")) {
                                                                                i2 = 74898;
                                                                            } else {
                                                                                i2 = 75540;
                                                                            }
                                                                            break;
                                                                        default:
                                                                            switch (str) {
                                                                                case "CK":
                                                                                    i2 = 74386;
                                                                                    break;
                                                                                case "CL":
                                                                                    i2 = 74888;
                                                                                    break;
                                                                                case "CM":
                                                                                    i2 = 75996;
                                                                                    break;
                                                                                case "CN":
                                                                                    i2 = 45634;
                                                                                    break;
                                                                                case "CO":
                                                                                    i2 = 74970;
                                                                                    break;
                                                                                default:
                                                                                    switch (str) {
                                                                                        case 2162:
                                                                                            if (!str.equals("CU")) {
                                                                                                i2 = 74898;
                                                                                            } else {
                                                                                                i2 = 76052;
                                                                                            }
                                                                                            break;
                                                                                        case 2163:
                                                                                            if (!str.equals("CV")) {
                                                                                                i2 = 74898;
                                                                                            } else {
                                                                                                i2 = 74266;
                                                                                            }
                                                                                            break;
                                                                                        case 2164:
                                                                                            if (!str.equals("CW")) {
                                                                                                i2 = 74898;
                                                                                            } else {
                                                                                                i2 = 73745;
                                                                                            }
                                                                                            break;
                                                                                        case 2165:
                                                                                            if (!str.equals("CX")) {
                                                                                                i2 = 74898;
                                                                                            } else {
                                                                                                i2 = 74896;
                                                                                            }
                                                                                            break;
                                                                                        case 2166:
                                                                                            if (!str.equals("CY")) {
                                                                                                i2 = 74898;
                                                                                            } else {
                                                                                                i2 = 65601;
                                                                                            }
                                                                                            break;
                                                                                        case 2167:
                                                                                            if (!str.equals("CZ")) {
                                                                                                i2 = 74898;
                                                                                            } else {
                                                                                                i2 = 69760;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            switch (str) {
                                                                                                case 2221:
                                                                                                    if (!str.equals("ER")) {
                                                                                                        i2 = 74898;
                                                                                                    } else {
                                                                                                        i2 = 74900;
                                                                                                    }
                                                                                                    break;
                                                                                                case 2222:
                                                                                                    if (!str.equals("ES")) {
                                                                                                        i2 = 74898;
                                                                                                    } else {
                                                                                                        i2 = 4096;
                                                                                                    }
                                                                                                    break;
                                                                                                case 2223:
                                                                                                    if (!str.equals("ET")) {
                                                                                                        i2 = 74898;
                                                                                                    } else {
                                                                                                        i2 = 84252;
                                                                                                    }
                                                                                                    break;
                                                                                                default:
                                                                                                    switch (str) {
                                                                                                        case 2243:
                                                                                                            if (!str.equals("FI")) {
                                                                                                                i2 = 74898;
                                                                                                            } else {
                                                                                                                i2 = 66048;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2244:
                                                                                                            if (!str.equals("FJ")) {
                                                                                                                i2 = 74898;
                                                                                                            } else {
                                                                                                                i2 = 75411;
                                                                                                            }
                                                                                                            break;
                                                                                                        case 2245:
                                                                                                            if (!str.equals("FK")) {
                                                                                                                i2 = 74898;
                                                                                                            } else {
                                                                                                                i2 = 74899;
                                                                                                            }
                                                                                                            break;
                                                                                                        default:
                                                                                                            switch (str) {
                                                                                                                case 2269:
                                                                                                                    if (!str.equals("GD")) {
                                                                                                                        i2 = 74898;
                                                                                                                    } else {
                                                                                                                        i2 = 73746;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2270:
                                                                                                                    if (!str.equals("GE")) {
                                                                                                                        i2 = 74898;
                                                                                                                    } else {
                                                                                                                        i2 = 74761;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2271:
                                                                                                                    if (!str.equals("GF")) {
                                                                                                                        i2 = 74898;
                                                                                                                    } else {
                                                                                                                        i2 = 75475;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2272:
                                                                                                                    if (!str.equals("GG")) {
                                                                                                                        i2 = 74898;
                                                                                                                    } else {
                                                                                                                        i2 = 74320;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2273:
                                                                                                                    if (!str.equals("GH")) {
                                                                                                                        i2 = 74898;
                                                                                                                    } else {
                                                                                                                        i2 = 74971;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                case 2274:
                                                                                                                    if (!str.equals("GI")) {
                                                                                                                        i2 = 74898;
                                                                                                                    } else {
                                                                                                                        i2 = 74256;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                default:
                                                                                                                    switch (str) {
                                                                                                                        case 2277:
                                                                                                                            if (!str.equals("GL")) {
                                                                                                                                i2 = 74898;
                                                                                                                            } else {
                                                                                                                                i2 = 73873;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 2278:
                                                                                                                            if (!str.equals("GM")) {
                                                                                                                                i2 = 74898;
                                                                                                                            } else {
                                                                                                                                i2 = 75932;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        case 2279:
                                                                                                                            if (!str.equals("GN")) {
                                                                                                                                i2 = 74898;
                                                                                                                            } else {
                                                                                                                                i2 = 75043;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        default:
                                                                                                                            switch (str) {
                                                                                                                                case 2281:
                                                                                                                                    if (!str.equals("GP")) {
                                                                                                                                        i2 = 74898;
                                                                                                                                    } else {
                                                                                                                                        i2 = 75338;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 2282:
                                                                                                                                    if (!str.equals("GQ")) {
                                                                                                                                        i2 = 74898;
                                                                                                                                    } else {
                                                                                                                                        i2 = 76068;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                case 2283:
                                                                                                                                    if (!str.equals("GR")) {
                                                                                                                                        i2 = 74898;
                                                                                                                                    } else {
                                                                                                                                        i2 = 69633;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                                default:
                                                                                                                                    switch (str) {
                                                                                                                                        case 2096:
                                                                                                                                            if (!str.equals("AQ")) {
                                                                                                                                                i2 = 74898;
                                                                                                                                            } else {
                                                                                                                                                i2 = 74900;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2097:
                                                                                                                                            if (!str.equals("AR")) {
                                                                                                                                                i2 = 74898;
                                                                                                                                            } else {
                                                                                                                                                i2 = 70802;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2098:
                                                                                                                                            if (!str.equals("AS")) {
                                                                                                                                                i2 = 74898;
                                                                                                                                            } else {
                                                                                                                                                i2 = 75474;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2099:
                                                                                                                                            if (!str.equals("AT")) {
                                                                                                                                                i2 = 74898;
                                                                                                                                            } else {
                                                                                                                                                i2 = 65536;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        case 2100:
                                                                                                                                            if (!str.equals("AU")) {
                                                                                                                                                i2 = 74898;
                                                                                                                                            } else {
                                                                                                                                                i2 = 12888;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        default:
                                                                                                                                            switch (str) {
                                                                                                                                                case 2122:
                                                                                                                                                    if (!str.equals("BL")) {
                                                                                                                                                        i2 = 74898;
                                                                                                                                                    } else {
                                                                                                                                                        i2 = 74897;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 2123:
                                                                                                                                                    if (!str.equals("BM")) {
                                                                                                                                                        i2 = 74898;
                                                                                                                                                    } else {
                                                                                                                                                        i2 = 73744;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 2124:
                                                                                                                                                    if (!str.equals("BN")) {
                                                                                                                                                        i2 = 74898;
                                                                                                                                                    } else {
                                                                                                                                                        i2 = 73747;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                case 2125:
                                                                                                                                                    if (!str.equals("BO")) {
                                                                                                                                                        i2 = 74898;
                                                                                                                                                    } else {
                                                                                                                                                        i2 = 76049;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                default:
                                                                                                                                                    switch (str) {
                                                                                                                                                        case 2127:
                                                                                                                                                            if (!str.equals("BQ")) {
                                                                                                                                                                i2 = 74898;
                                                                                                                                                            } else {
                                                                                                                                                                i2 = 73745;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 2128:
                                                                                                                                                            if (!str.equals("BR")) {
                                                                                                                                                                i2 = 74898;
                                                                                                                                                            } else {
                                                                                                                                                                i2 = 139849;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 2129:
                                                                                                                                                            if (!str.equals("BS")) {
                                                                                                                                                                i2 = 74898;
                                                                                                                                                            } else {
                                                                                                                                                                i2 = 74323;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        case 2130:
                                                                                                                                                            if (!str.equals("BT")) {
                                                                                                                                                                i2 = 74898;
                                                                                                                                                            } else {
                                                                                                                                                                i2 = 78987;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                        default:
                                                                                                                                                            switch (str) {
                                                                                                                                                                case 2147:
                                                                                                                                                                    if (!str.equals("CF")) {
                                                                                                                                                                        i2 = 74898;
                                                                                                                                                                    } else {
                                                                                                                                                                        i2 = 75028;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 2148:
                                                                                                                                                                    if (!str.equals("CG")) {
                                                                                                                                                                        i2 = 74898;
                                                                                                                                                                    } else {
                                                                                                                                                                        i2 = 75491;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 2149:
                                                                                                                                                                    if (!str.equals("CH")) {
                                                                                                                                                                        i2 = 74898;
                                                                                                                                                                    } else {
                                                                                                                                                                        i2 = 65544;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                case 2150:
                                                                                                                                                                    if (!str.equals("CI")) {
                                                                                                                                                                        i2 = 74898;
                                                                                                                                                                    } else {
                                                                                                                                                                        i2 = 76002;
                                                                                                                                                                    }
                                                                                                                                                                    break;
                                                                                                                                                                default:
                                                                                                                                                                    i2 = 74898;
                                                                                                                                                                    break;
                                                                                                                                                            }
                                                                                                                                                            break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                    }
                                                                                                                                    break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                            }
                                                                                                            break;
                                                                                                    }
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    if (!str.equals("GB")) {
                                                                        i2 = 74898;
                                                                    } else {
                                                                        i2 = 74953;
                                                                    }
                                                                    break;
                                                                }
                                                            } else {
                                                                if (!str.equals("GA")) {
                                                                    i2 = 74898;
                                                                } else {
                                                                    i2 = 73763;
                                                                }
                                                                break;
                                                            }
                                                        } else {
                                                            if (!str.equals("DK")) {
                                                                i2 = 74898;
                                                            } else {
                                                                i2 = 65664;
                                                            }
                                                            break;
                                                        }
                                                    } else {
                                                        if (!str.equals("DJ")) {
                                                            i2 = 74898;
                                                        } else {
                                                            i2 = 75476;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                            }
                                        } else if (str.equals("BZ")) {
                                            i2 = 74386;
                                        } else {
                                            i2 = 74898;
                                        }
                                    } else if (str.equals("BY")) {
                                        i2 = 75473;
                                    } else {
                                        i2 = 74898;
                                    }
                                } else if (str.equals("BB")) {
                                    i2 = 73745;
                                } else {
                                    i2 = 74898;
                                }
                            } else if (str.equals("BA")) {
                                i2 = 74313;
                            } else {
                                i2 = 74898;
                            }
                        } else if (str.equals("AX")) {
                            i2 = 74896;
                        } else {
                            i2 = 74898;
                        }
                    } else if (str.equals("AW")) {
                        i2 = 75986;
                    } else {
                        i2 = 74898;
                    }
                } else if (str.equals("AM")) {
                    i2 = 75418;
                } else {
                    i2 = 74898;
                }
            } else if (str.equals("AL")) {
                i2 = 74825;
            } else {
                i2 = 74898;
            }
            if (i == 2) {
                jLongValue = ((Long) n.get(i2 & 7)).longValue();
            } else if (i == 3) {
                jLongValue = ((Long) o.get((i2 >> 3) & 7)).longValue();
            } else if (i == 4) {
                jLongValue = ((Long) p.get((i2 >> 6) & 7)).longValue();
            } else if (i == 5) {
                jLongValue = ((Long) q.get((i2 >> 9) & 7)).longValue();
            } else if (i == 7) {
                jLongValue = ((Long) n.get(i2 & 7)).longValue();
            } else if (i == 9) {
                jLongValue = ((Long) s.get(i2 >> 15)).longValue();
            } else if (i != 10) {
                jLongValue = 1000000;
            } else {
                jLongValue = ((Long) r.get((i2 >> 12) & 7)).longValue();
            }
            lValueOf = Long.valueOf(jLongValue);
        }
        if (lValueOf == null) {
            lValueOf = 1000000L;
        }
        return lValueOf.longValue();
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final synchronized void i(zzia zziaVar, boolean z, int i) {
        boolean z2;
        if (z) {
            zziaVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.g += (long) i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final synchronized void l(zzho zzhoVar, zzia zziaVar, boolean z) {
        boolean z2;
        if (z) {
            zziaVar.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.e == 0) {
                this.f = SystemClock.elapsedRealtime();
            }
            this.e++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final zzace zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void a(zzpz zzpzVar) {
        CopyOnWriteArrayList<zl3> copyOnWriteArrayList = this.c.a;
        for (zl3 zl3Var : copyOnWriteArrayList) {
            if (zl3Var.b == zzpzVar) {
                zl3Var.c = true;
                copyOnWriteArrayList.remove(zl3Var);
            }
        }
    }

    static {
        Long lValueOf = Long.valueOf(SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US);
        p = zzgzb.z(lValueOf, 1300000L, 1000000L, 860000L, 610000L);
        q = zzgzb.z(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        r = zzgzb.z(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        s = zzgzb.z(2700000L, lValueOf, 1600000L, 1300000L, 1000000L);
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [cm3] */
    public zzace(Context context, HashMap map) {
        Context applicationContext;
        boolean z;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
        this.b = zzgze.a(map);
        this.c = new zzaby();
        this.d = new zzacs();
        if (context != null) {
            zzes zzesVarA = zzes.a(context);
            int iB = zzesVarA.b();
            this.l = iB;
            this.j = d(iB);
            ?? r6 = new zzem() { // from class: cm3
                /* JADX WARN: Code duplicated, block: B:25:0x003f A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:4:0x0003, B:6:0x0007, B:11:0x0011, B:16:0x001c, B:18:0x0020, B:20:0x0026, B:22:0x0030, B:24:0x003a, B:26:0x004b, B:25:0x003f, B:27:0x004d, B:29:0x005c, B:31:0x0063, B:35:0x006f, B:41:0x007d, B:42:0x0084), top: B:49:0x0003 }] */
                @Override // com.google.android.gms.internal.ads.zzem
                public final void zza(int i) {
                    int i2;
                    long j;
                    String strB;
                    TelephonyManager telephonyManager;
                    zzace zzaceVar = this.a;
                    synchronized (zzaceVar) {
                        try {
                            if (zzaceVar.l != i || zzaceVar.m == null) {
                                zzaceVar.l = i;
                                if (i != 1 && i != 0 && i != 8) {
                                    if (zzaceVar.m == null) {
                                        Context context2 = zzaceVar.a;
                                        String str = zzfq.a;
                                        if (context2 == null || (telephonyManager = (TelephonyManager) context2.getSystemService("phone")) == null) {
                                            strB = zzgvh.b(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strB = zzgvh.b(Locale.getDefault().getCountry());
                                            } else {
                                                strB = zzgvh.b(networkCountryIso);
                                            }
                                        }
                                        zzaceVar.m = strB;
                                    }
                                    zzaceVar.j = zzaceVar.d(i);
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    int i3 = zzaceVar.e > 0 ? (int) (jElapsedRealtime - zzaceVar.f) : 0;
                                    long j2 = zzaceVar.g;
                                    long j3 = zzaceVar.j;
                                    if (i3 == 0) {
                                        if (j2 != 0) {
                                            i2 = 0;
                                        } else if (j3 != zzaceVar.k) {
                                            i2 = 0;
                                            j = 0;
                                            zzaceVar.k = j3;
                                            zzaceVar.c.a(i2, j, j3);
                                        }
                                        zzaceVar.f = jElapsedRealtime;
                                        zzaceVar.g = 0L;
                                        zzaceVar.i = 0L;
                                        zzaceVar.h = 0L;
                                        zzacs zzacsVar = zzaceVar.d;
                                        zzacsVar.a.clear();
                                        zzacsVar.c = -1;
                                        zzacsVar.d = 0;
                                        zzacsVar.e = 0;
                                    }
                                    i2 = i3;
                                    j = j2;
                                    zzaceVar.k = j3;
                                    zzaceVar.c.a(i2, j, j3);
                                    zzaceVar.f = jElapsedRealtime;
                                    zzaceVar.g = 0L;
                                    zzaceVar.i = 0L;
                                    zzaceVar.h = 0L;
                                    zzacs zzacsVar2 = zzaceVar.d;
                                    zzacsVar2.a.clear();
                                    zzacsVar2.c = -1;
                                    zzacsVar2.d = 0;
                                    zzacsVar2.e = 0;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            Executor executorA = zzdi.a();
            CopyOnWriteArrayList<je4> copyOnWriteArrayList = zzesVarA.b;
            for (je4 je4Var : copyOnWriteArrayList) {
                if (je4Var.a.get() == null) {
                    copyOnWriteArrayList.remove(je4Var);
                }
            }
            je4 je4Var2 = new je4(zzesVarA, r6, executorA);
            synchronized (zzesVarA.c) {
                zzesVarA.b.add(je4Var2);
                z = zzesVarA.e;
            }
            if (z) {
                je4Var2.b.execute(new bd4(je4Var2, 4));
                return;
            }
            return;
        }
        this.l = 0;
        this.j = 1000000L;
    }

    @Override // com.google.android.gms.internal.ads.zzaca
    public final void b(Handler handler, zzpz zzpzVar) {
        zzpzVar.getClass();
        zzaby zzabyVar = this.c;
        CopyOnWriteArrayList<zl3> copyOnWriteArrayList = zzabyVar.a;
        for (zl3 zl3Var : copyOnWriteArrayList) {
            if (zl3Var.b == zzpzVar) {
                zl3Var.c = true;
                copyOnWriteArrayList.remove(zl3Var);
            }
        }
        zzabyVar.a.add(new zl3(handler, zzpzVar));
    }
}
