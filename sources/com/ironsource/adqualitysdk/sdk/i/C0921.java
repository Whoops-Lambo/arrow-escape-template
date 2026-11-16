package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Tap;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.external.VideoContentListenerAdapter;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IArichMediaVideoView;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᖟ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C0921 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f2479 = StringFog.decrypt("TMPGXPfC49RF0uJt7dP0wljD1k3nweTUWNI=\n", "K6ayH4KwkbE=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f2478 = StringFog.decrypt("7dhR8OYkTd/u\n", "ir0lo5ZLOZY=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2477 = StringFog.decrypt("KBoY8qkQqcY7GgLH\n", "T39ss81Txqg=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f2476 = StringFog.decrypt("Juu3XLm3Byc9/ZRHlL8=\n", "T5jxKdXbdEQ=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f2475 = StringFog.decrypt("2GhJSm7shmvV\n", "sRsfIwqJ6So=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f2474 = StringFog.decrypt("uyb4fwnATG+IK/5TEM5HUa4v\n", "3EOMPGWpLwQ=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f2473 = StringFog.decrypt("8xVyvaRipUvg\n", "lHAG8cUbyj4=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f2472 = StringFog.decrypt("42bOkgZvGtHwZt6UDWoL8ettzrMMbxPX9g==\n", "hAO6wWMDf7I=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f2471 = StringFog.decrypt("puaeVxzmjBa15o5HFuSdEK/3qWsX/psare+Pdg==\n", "wYPqBHmK6XU=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f2470 = StringFog.decrypt("lmqS9pIWaKyCQ4/AkBZovYM=\n", "8Q/ms+RzBtg=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f2469 = StringFog.decrypt("oPMzbmdN1QOg2i5YZU3VEqE=\n", "05ZHKxEou3c=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f2468 = StringFog.decrypt("WabaHPoAyKhK\n", "PsOuXZ5TuMc=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f2467 = StringFog.decrypt("+xEPcuAjEiz1BwtL7zMyEewRPkn7Jw==\n", "nHR7J45KZmg=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f2466 = StringFog.decrypt("PW0+7zmJ59oYaSTMLprY1z9/A8Y=\n", "WghKokvojr4=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2465 = StringFog.decrypt("9TRgkNu1Q37hIn222IFQb/MVe7TXrF8=\n", "klEU2bbFMRs=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2464 = StringFog.decrypt("STDCzKUaLExpKMnguQ8qSm4/wOulFDhLZSztyqMSOVF0Jw==\n", "AF6sqdd7Tzg=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f2463 = StringFog.decrypt("0gP9Mjp6gDvDQvlyMmaQP9IY+Wo5LZE62kLxfyhqlDfFBfVvckqMMNQe8X8oapQ7+ALkeS5tgzLz\nHv9rL2aQH9IY+Wo1d5s=\n", "sWyQHFwD4l4=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f2462 = StringFog.decrypt("rC0bUsmXIwOMNRBxzposBIYxEFLVtyQ2hjccQdKCOQ==\n", "5UN1N7v2QHc=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2461 = StringFog.decrypt("SnVI836AMrRbNEyzdpwisEpuTKt91yO1QjREvmyQJrhdc0CuNrA+v0xoRL5skCa0b29JsWuaIrRM\ndGS5WZokuF9zUaQ=\n", "KRol3Rj5UNE=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2460 = StringFog.decrypt("dPN76r2MXdFU63Ddpo5W6Fj5fO6ZhFrAUs157raITORe6Xz5pplH5lLvcA==\n", "PZ0Vj8/tPqU=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2459 = StringFog.decrypt("yKzT+h/x2P/Z7de6F+3I+8i316Icpsn+wO3ftw3hzPPfqtunV8HU9M6x37cN4cz/+ardvDTt3vPK\nldewHOfq9sq626Y4687z3arKrTrnyP8=\n", "q8O+1HmIupo=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2458 = StringFog.decrypt("TlhKbo3Oz5BuQEFKm/zci3M=\n", "BzYkC/+vrOQ=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2457 = StringFog.decrypt("h0PFtQ1HRDanW86RG3RCM7tI2KQ=\n", "zi2r0H8mJ0I=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2456 = StringFog.decrypt("C/fEhf4UvwEr78+h6Ce5Gyb82IX+\n", "Qpmq4Ix13HU=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2455 = StringFog.decrypt("Ec/UqFQL3wEx19+AQw7VFCzI1aNoC9EQ\n", "WKG6zSZqvHU=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2454 = StringFog.decrypt("Y5oq9uwY0otnugf45RvJ\n", "KttpmYJ+u+w=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2453 = StringFog.decrypt("/Cu6o1y5AovcM7GFQbYVmtsxl6lArBOQ2SmxtA==\n", "tUXUxi7YYf8=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2452 = StringFog.decrypt("vDlya9gqGvycIXlbxCINy5o5aHzFJxXthw==\n", "9VccDqpLeYg=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2451 = StringFog.decrypt("twueSmjb+aKXE5Vufuzzs4kwnkZu+fW4ihefQ3bf6A==\n", "/mXwLxq6mtY=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2450 = StringFog.decrypt("0yNMdLD8XsDqLFxUjeVI\n", "hk0lAPSVLbA=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2449 = StringFog.decrypt("J27G1m0KmfIRbMbWfAs=\n", "YhijuBl51Zs=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2448 = StringFog.decrypt("cg==\n", "IJ0eLArLXp4=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2447 = StringFog.decrypt("/924VRCRcjvfxbN2F5x9PNXBs1UMpngr09yVXwyEdCHC8LleFoJ+I9rWpA==\n", "trPWMGLwEU8=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2446 = StringFog.decrypt("CHywokOrwTYoZLuBRKbOMSJgu6Jfi8YHN3ews0KGyzE1d7CiQw==\n", "QRLexzHKokI=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2445 = StringFog.decrypt("e/3/KfF8Bo5Z8fU40lYalEj6/j4=\n", "LZSbTJ4/aeA=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2444 = StringFog.decrypt("4RF/6a2uVzLqDWT7rKVEEsEMf+mxpUQ=\n", "qH8LjN/ANl4=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2443 = StringFog.decrypt("smcp1VWPUdafUDPVdKpcwIRjNNVx\n", "8AZasAPmNbM=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2442 = StringFog.decrypt("MjAS\n", "ZlFiTbqTFRI=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2441 = StringFog.decrypt("RXl4VMo7Ck9lYXN3zTYFSG9lc1TWGw1+enJ4RcsWAEh4cnhUyhsNWnxjc0M=\n", "DBcWMbhaaTs=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2440 = StringFog.decrypt("wt5jKGeXdAjixmgLYJp7D+jCaCh7o3kV//NiI2GEeBDn1X8=\n", "i7ANTRX2F3w=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2439 = StringFog.decrypt("edVcEel8kmxZzVc1/0uYfUftWxD+crJ3Xs9XGu9ennZEyV0Y93iD\n", "MLsydJsd8Rg=\n");

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2438 = StringFog.decrypt("D2utvmSTPpI5aa2+dZIznyttvLVi\n", "Sh3I0BDgcvs=\n");

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2437 = StringFog.decrypt("FlBTi5VVhJU0XFmatn+YjyVXUpy7coqLNFxF\n", "QDk37voW6/s=\n");

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2436 = StringFog.decrypt("BugIbkNqxWUm3Q==\n", "T6lFHCIDoS4=\n");

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2435 = StringFog.decrypt("3AjqMysNJ4rwK9EoLxMAsvs99S4mCCav\n", "lUmHQUpkQ90=\n");

    /* JADX INFO: renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2434 = StringFog.decrypt("SHtNGc5R4SVoTg==\n", "ATobcKo0jm4=\n");

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2433 = StringFog.decrypt("EVQoXwUekt83VxxMFAw=\n", "WDlYLWBt4bY=\n");

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2432 = StringFog.decrypt("9g9+5MVRIhnbJ23bz10KE+knafo=\n", "v04MjaY5b3w=\n");

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    public static final String f2431 = StringFog.decrypt("6c6cPAd/pn7J1pcfAHKpecPSlzwbX6FP1sWcLQZSrHnUxZw8B0msfsjpnykHe7Z5yc+cHRRqpA==\n", "oKDyWXUexQo=\n");

    /* JADX INFO: renamed from: ე, reason: contains not printable characters */
    public static final String f2430 = StringFog.decrypt("2j8noIdCXqr6JyyEkXVUu+QUP6CbV06S+iI9oJtGT4n6JSGMmFNPu+AiIKqbZ1yq8g==\n", "k1FJxfUjPd4=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f2479, new C1021(this));
        map.put(f2478, new C1011(this));
        map.put(f2477, new C1008(this));
        map.put(f2476, new C0991(this));
        map.put(f2475, new C0982(this));
        map.put(f2474, new C0978(this));
        map.put(f2473, new C0973(this));
        map.put(f2472, new C0952(this));
        map.put(f2471, new C0944(this));
        map.put(f2470, new C1137(this));
        map.put(f2469, new C1136(this));
        map.put(f2468, new C1063(this));
        map.put(f2467, new C1062(this));
        map.put(f2466, new C1032(this));
        map.put(f2465, new C1023(this));
        return map;
    }

    public C0921(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        return InneractiveAdManager.getVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x019b  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -1764994669:
                if (str.equals(f2434)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case -1757761411:
                if (str.equals(f2437)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -1751837367:
                if (str.equals(f2462)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case -1661930846:
                if (str.equals(f2459)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1611796569:
                if (str.equals(f2446)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case -1452673136:
                if (str.equals(f2457)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1264220508:
                if (str.equals(f2451)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1205203919:
                if (str.equals(f2447)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case -1190251081:
                if (str.equals(f2440)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -1115843213:
                if (str.equals(f2433)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case -955341033:
                if (str.equals(f2436)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -758374370:
                if (str.equals(f2439)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -587023626:
                if (str.equals(f2435)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case -312786562:
                if (str.equals(f2464)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -233888832:
                if (str.equals(f2431)) {
                    b = 33;
                } else {
                    b = -1;
                }
                break;
            case -50587944:
                if (str.equals(f2450)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case 82:
                if (str.equals(f2448)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 83843:
                if (str.equals(f2442)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 114221977:
                if (str.equals(f2453)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 218220615:
                if (str.equals(f2455)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 294386593:
                if (str.equals(f2458)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 305774826:
                if (str.equals(f2430)) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case 334157136:
                if (str.equals(f2432)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case 598324252:
                if (str.equals(f2452)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 652259752:
                if (str.equals(f2441)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 778319234:
                if (str.equals(f2438)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 809010015:
                if (str.equals(f2444)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 986039922:
                if (str.equals(f2445)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 996606931:
                if (str.equals(f2454)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 1840053850:
                if (str.equals(f2463)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 1945237502:
                if (str.equals(f2460)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 1956883725:
                if (str.equals(f2449)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 2019288557:
                if (str.equals(f2461)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 2082429859:
                if (str.equals(f2443)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case 2110184418:
                if (str.equals(f2456)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return InneractiveInternalBrowserActivity.class;
            case 2:
            case 3:
                return InneractiveFullscreenAdActivity.class;
            case 4:
            case 5:
                return InneractiveRichMediaVideoPlayerActivityCore.class;
            case 6:
                return InneractiveAdSpot.class;
            case 7:
                return InneractiveAdRequest.class;
            case 8:
                return InneractiveAdRenderer.class;
            case 9:
                return InneractiveMediationName.class;
            case 10:
                return IAConfigManager.class;
            case 11:
                return InneractiveContentController.class;
            case 12:
                return InneractiveUnitController.class;
            case 13:
                return InneractiveAdViewUnitController.class;
            case 14:
                return UnitDisplayType.class;
            case 15:
                return InneractiveUnitController.EventsListener.class;
            case 16:
                return R.class;
            case 17:
                return InneractiveFullscreenVideoContentController.class;
            case 18:
                return InneractiveFullscreenAdEventsListener.class;
            case 19:
                return VideoContentListener.class;
            case 20:
                return InneractiveInternalBrowserActivity.InternalBrowserListener.class;
            case 21:
                return Tap.class;
            case 22:
                return InneractiveFullscreenAdEventsListenerAdapter.class;
            case 23:
                return InneractiveFullscreenUnitController.class;
            case 24:
                return InneractiveAdViewVideoContentController.class;
            case 25:
                return InneractiveUnitController.EventsListenerAdapter.class;
            case 26:
                return VideoContentListenerAdapter.class;
            case 27:
                return IAMraidKit.class;
            case 28:
                return IAmraidWebViewController.class;
            case 29:
                return IAVideoKit.class;
            case 30:
                return ImpressionData.class;
            case 31:
                return IArichMediaVideoView.class;
            case 32:
                return IArichMediaVideoView.BaseVideoViewListener.class;
            case 33:
                return InneractiveFullscreenAdEventsListenerWithImpressionData.class;
            case 34:
                return InneractiveAdViewEventsListenerWithImpressionData.class;
            default:
                return null;
        }
    }
}
