package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C5073y1;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.mbridge.msdk.newreward.player.BaseActivity;
import com.mbridge.msdk.newreward.player.MBRewardVideoActivity;
import com.mintegral.msdk.MIntegralConstans;
import com.mintegral.msdk.MIntegralSDK;
import com.mintegral.msdk.activity.DomainMTGCommonActivity;
import com.mintegral.msdk.activity.MTGCommonActivity;
import com.mintegral.msdk.appwall.BottomRefreshListView;
import com.mintegral.msdk.appwall.MintegralAdActivity;
import com.mintegral.msdk.appwall.ShuffleFragment;
import com.mintegral.msdk.appwall.TabListFragment;
import com.mintegral.msdk.appwall.WallFragment;
import com.mintegral.msdk.appwall.report.eventcache.ImpressionCampaignExModel;
import com.mintegral.msdk.appwall.service.WallService;
import com.mintegral.msdk.appwall.view.WallViewPager;
import com.mintegral.msdk.appwall.viewpager.indicater.TabPageIndicator;
import com.mintegral.msdk.appwallex.TabListView;
import com.mintegral.msdk.appwallex.WallView;
import com.mintegral.msdk.base.entity.CampaignEx;
import com.mintegral.msdk.base.entity.CampaignUnit;
import com.mintegral.msdk.base.fragment.BaseFragment;
import com.mintegral.msdk.base.webview.BrowserView;
import com.mintegral.msdk.base.webview.WebViewFragment;
import com.mintegral.msdk.click.AppReceiver;
import com.mintegral.msdk.click.CommonJumpLoader;
import com.mintegral.msdk.interstitial.jscommon.interstitial;
import com.mintegral.msdk.interstitial.view.MTGInterstitialActivity;
import com.mintegral.msdk.interstitialvideo.out.InterstitialVideoListener;
import com.mintegral.msdk.interstitialvideo.out.MTGBidInterstitialVideoHandler;
import com.mintegral.msdk.interstitialvideo.out.MTGInterstitialVideoHandler;
import com.mintegral.msdk.mtgbanner.view.MTGBannerWebView;
import com.mintegral.msdk.mtgbid.out.BidManager;
import com.mintegral.msdk.mtgbid.out.BidResponsed;
import com.mintegral.msdk.mtgjscommon.authority.activity.MTGAuthorityActivity;
import com.mintegral.msdk.mtgjscommon.base.BaseWebView;
import com.mintegral.msdk.mtgjscommon.windvane.WindVaneWebView;
import com.mintegral.msdk.out.AppWallTrackingListener;
import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.Campaign;
import com.mintegral.msdk.out.IDownloadListener;
import com.mintegral.msdk.out.InterstitialListener;
import com.mintegral.msdk.out.LoadingActivity;
import com.mintegral.msdk.out.MIntegralSDKFactory;
import com.mintegral.msdk.out.MTGBannerView;
import com.mintegral.msdk.out.MTGBidRewardVideoHandler;
import com.mintegral.msdk.out.MTGConfiguration;
import com.mintegral.msdk.out.MTGInterstitialHandler;
import com.mintegral.msdk.out.MTGOfferWallHandler;
import com.mintegral.msdk.out.MTGRewardVideoHandler;
import com.mintegral.msdk.out.MtgBidCommonHandler;
import com.mintegral.msdk.out.MtgWallHandler;
import com.mintegral.msdk.out.NativeListener;
import com.mintegral.msdk.out.OnMTGMediaViewListener;
import com.mintegral.msdk.out.RewardVideoListener;
import com.mintegral.msdk.reward.player.MTGRewardVideoActivity;
import com.mintegral.msdk.rover.RoverCampaignUnit;
import com.mintegral.msdk.shell.MTGActivity;
import com.mintegral.msdk.video.js.activity.AbstractActivity;
import com.mintegral.msdk.video.js.activity.AbstractJSActivity;
import com.mintegral.msdk.video.js.activity.VideoWebViewActivity;
import com.mintegral.msdk.video.module.MintegralBaseView;
import com.mintegral.msdk.video.module.MintegralClickCTAView;
import com.mintegral.msdk.video.module.MintegralClickMiniCardView;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralH5EndCardView;
import com.mintegral.msdk.video.module.MintegralLandingPageView;
import com.mintegral.msdk.video.module.MintegralNativeEndCardView;
import com.mintegral.msdk.video.module.MintegralPlayableView;
import com.mintegral.msdk.video.module.MintegralVastEndCardView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.videocommon.dialog.MTGAlertDialog;
import com.mintegral.msdk.videocommon.listener.InterVideoOutListener;
import com.mintegral.msdk.widget.MTGImageView;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᓵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0868 extends AbstractC1344 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f2350 = StringFog.decrypt("FtqeLv0KxIkY2IQo5A==\n", "cb/qbZxntOg=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f2349 = StringFog.decrypt("mso5OzmtgwM=\n", "/a9Nel3bymc=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2348 = StringFog.decrypt("ajAEwVyRSItAETHjR5ZBjA==\n", "J2RDgjP/LuI=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f2347 = StringFog.decrypt("lpHPzlqvqmC/k+H4WreKca+s/vVLoQ==\n", "28WInD/YyxI=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f2346 = StringFog.decrypt("gm3EPEsKLKSmTfo=\n", "zzmDfSh+RdI=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f2345 = StringFog.decrypt("hBS6lO7jo3GnAZ6j6PinarA=\n", "yUD914GOzh4=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f2344 = StringFog.decrypt("LKuGkxwsKkUTlrWrKDs2QxeWtas=\n", "Yf/B0mlYQio=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f2343 = StringFog.decrypt("HBjp2Is5mUEiOMfljCyQezAiyv2APw==\n", "UUyukeVN/DM=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f2342 = StringFog.decrypt("qZNf5rf3qmCXs3HbsOKjRI2jfcCR4qF2iKJq\n", "5McYr9mDzxI=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f2341 = StringFog.decrypt("J96METruK00O3KInOvYCXgTupyYt\n", "aorLQ1+ZSj8=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f2340 = StringFog.decrypt("rrW5sHztYsWXhIyBYeBfwoKNqJtx7ETjgo+annD7\n", "4+H+8hWJK6s=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f2339 = StringFog.decrypt("kZENopbVICWrpDiEqdgWJbONK46b3Rcy\n", "3MVK4P+xckA=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f2338 = StringFog.decrypt("wZPTR+/hS7T+kf1g+Q==\n", "jMeUBY6PJdE=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f2337 = StringFog.decrypt("ZR91fwLdBXxjF2owA5oGe2IbNj4awEVFUjdaMAHaDnpQGX0m\n", "BnAYUW+0awg=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2336 = StringFog.decrypt("Qnn8oMXtMTZ9et6A8uo6JA==\n", "Dy274qSDX1M=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2335 = StringFog.decrypt("TrQ+8LVv7D9IvCG/tCjvOEmwfbOsYeAqQ7U2rPZw6y5a9R6Kn0TjJUO+IYm9ZNQiSKw=\n", "LdtT3tgGgks=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f2334 = StringFog.decrypt("rGYj/FdbFW6WYiHk\n", "+wdPkBEpdAk=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f2333 = StringFog.decrypt("oOmwh/q0+nCm4a/I+/P5d6ft88jnreNlr+rz/vax+EKx57rE8rPg\n", "w4bdqZfdlAQ=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2332 = StringFog.decrypt("/ANc6IjRXn3PEk/UgNNVZdQAWNqH2EA=\n", "vXMsv+m9Mik=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2331 = StringFog.decrypt("Ofwr1aqiKpIf/C70pr8q\n", "bZ1JmcPRXtQ=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2330 = StringFog.decrypt("53YP/ZTkZIDGfx32l+Z1\n", "tB56m/KIAcY=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2329 = StringFog.decrypt("4YcRTaKDZVXFmgBKpaJeQ9e+DFy6\n", "o+hlOc3uNzA=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2328 = StringFog.decrypt("T/kyibESCUF1/Dm6sQEDeg==\n", "G5hQ2dB1bAg=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2327 = StringFog.decrypt("e5ZbtMhaeJF8llC97A==\n", "LPc32J4zHeY=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2326 = StringFog.decrypt("1TjX7ojVd/TTMMihiZJ089I8lKGVzG7h2juUtozZbq7hNtass9V89+Y23aWX\n", "tle6wOW8GYA=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2325 = StringFog.decrypt("KvB+iKySXVUU8nc=\n", "fZES5P/3LyM=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2324 = StringFog.decrypt("Ohi5WuYq0Y8cG4pJ7inDjxQbjFDONsaDHw==\n", "c3XJKINZouY=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2323 = StringFog.decrypt("B5yjB1uxLMU6mLY=\n", "U/3BSzLCWJM=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2322 = StringFog.decrypt("duYN8x8Z+Kc=\n", "IYdhn0lwndA=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2321 = StringFog.decrypt("XWEERopko8xbaRsJiyOgy1plRwmXfbrZUmIMEMlarNRSWAANkA==\n", "Pg5paOcNzbg=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2320 = StringFog.decrypt("SctwhuQ2LA5Pw2/J5XEvCU7PM8roLCdUXcF/3uA6NVRo1nLf+jowLEPBag==\n", "KqQdqIlfQno=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2319 = StringFog.decrypt("j7NouLusWdiUjkqG\n", "wucv8dbNPr0=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2318 = StringFog.decrypt("w1uv3HipDX/FU7CTee4OeMRf7IV8pARu1BqPplKJDmrHUZSbcLc=\n", "oDTC8hXAYws=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2317 = StringFog.decrypt("1sfVBxEWk0X0ycoFDQCcQfA=\n", "hKijYmNV8ig=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2316 = StringFog.decrypt("G6BD9kyIwJk3ukDNSJY=\n", "VtQkoS3krNE=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2315 = StringFog.decrypt("RYaTkKy+TUlfs7izgrlGX2S3pg==\n", "CNLU38rYKDs=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2314 = StringFog.decrypt("cUhOoqDd4xhRUUaOgdjOE1BZWw==\n", "PDwp4Mm5oHc=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2313 = StringFog.decrypt("1yNEA5ZNkPLwOA==\n", "lUogTvcj8ZU=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2312 = StringFog.decrypt("WnY3rmIyffV2bDaY\n", "GB9T/AdBDZo=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2311 = StringFog.decrypt("hGnXP/f0oECCYchw9rOjR4NtlHzu+qRHhGnXfPXz4FaGdd8/2Py9UbBj2Efz+Lk=\n", "5wa6EZqdzjQ=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2310 = StringFog.decrypt("NOt9LbIrj2Uy42Jis2yMYjPvPm6rJYtiNOt9brAsz2Y+6nR1viyEPwDtfmeJI490AOFyVbYnlg==\n", "V4QQA99C4RE=\n");

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2309 = StringFog.decrypt("+U0zrDl9StTwcBWBOn8=\n", "tBl07VUYOKA=\n");

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2308 = StringFog.decrypt("3Pp6uBdkuQza8mX3FiO6C9v+OeATabIX3Pp6+xVj+RzW9Hv5HSOaLPjUe/MIeZMR3vl48Q==\n", "v5UXlnoN13g=\n");

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2307 = StringFog.decrypt("7IfrP+6KhVDqj/Rw782GV+uDqGfqh45LoYXpdfaPjgrCgehl5oSZReO+73XmjL1N6p8=\n", "j+iGEYPj6yQ=\n");

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2306 = StringFog.decrypt("TZd9JQcf2Z9Ln2JqBljamEqTPn0DEtKEAJV/bx8a0sVjkX5/DxHFikKucXgeM9mPbZlibzwf0pw=\n", "LvgQC2p2t+s=\n");

    /* JADX INFO: renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2305 = StringFog.decrypt("8jiVRHGqDen0MIoLcO0O7vU81hx1pwbyvzqXDmmvBrPcPpYeeaQR/P0ZmR51tQbY/zO7C26nNfT0\nIA==\n", "kVf4ahzDY50=\n");

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2304 = StringFog.decrypt("YHSxdy0sS+1mfK44LGtI6mdw8i8pIUD2LXazPTUpQLdOcrItJSJX+G9YsDAjLmbNQk21PDc=\n", "AxvcWUBFJZk=\n");

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2303 = StringFog.decrypt("sV02t29LNe63VSn4bgw26bZZde9rRj71/F80/XdOPrSfWzXtZ0Up+75wOupndDL/pQ==\n", "0jJbmQIiW5o=\n");

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    public static final String f2302 = StringFog.decrypt("OqKfzwcpyuM8qoCABm7J5D2m3JcDJMH4d6CdhR8swbkUpJyVDyfW9jWOnogJK+n+N6SxgBgk8v48\nug==\n", "Wc3y4WpApJc=\n");

    /* JADX INFO: renamed from: ე, reason: contains not printable characters */
    public static final String f2301 = StringFog.decrypt("JeYNDbXuuN0j7hJCtKm72iLiTlWx47PGaOQPR63rs4cL4A5XveCkyCrKD02s5r/HI/s2Sr3w\n", "RolgI9iH1qk=\n");

    /* JADX INFO: renamed from: ງ, reason: contains not printable characters */
    public static final String f2300 = StringFog.decrypt("EIppsdZYSJwWgnb+1x9LmxeOKunSVUOHXYhr+85dQ8Y+jGrr3lZUiR+tMdrVVWWJAYFS9t5G\n", "c+UEn7sxJug=\n");

    /* JADX INFO: renamed from: อ, reason: contains not printable characters */
    public static final String f2299 = StringFog.decrypt("YBe5GlxG2wBmH6ZVXQHYB2cT+kJYS9AbLRW7UERD0FpOEbpAVEjHFW80tVpVRtsTUxmzUWdG0AM=\n", "A3jUNDEvtXQ=\n");

    /* JADX INFO: renamed from: ม, reason: contains not printable characters */
    public static final String f2298 = StringFog.decrypt("4UQvfBbL7y3nTDAzF4zsKuZAbCQSxuQ2rEYtNg7O5HfPQiwmHsXzOO57LjMCw+M1530rNww=\n", "gitCUnuigVk=\n");

    /* JADX INFO: renamed from: น, reason: contains not printable characters */
    public static final String f2297 = StringFog.decrypt("u+r/+y6QFQKd5eTGDKo8D4fw18EMrw==\n", "9ISyr2ndcGY=\n");

    /* JADX INFO: renamed from: ต, reason: contains not printable characters */
    public static final String f2296 = StringFog.decrypt("PUI6KsEHF9Y+bjgmxQY0wxpZPj3BHSM=\n", "eS1XS6hpWoI=\n");

    /* JADX INFO: renamed from: ฑ, reason: contains not printable characters */
    public static final String f2295 = StringFog.decrypt("eGheio5Yp8x+YEHFjx+ky39sHcWARaDOcnNKiqdepNlyaX7wpHKm1XZoXeWARaDOcnNK\n", "GwczpOMxybg=\n");

    /* JADX INFO: renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2294 = StringFog.decrypt("GO6cxb6OJP8DxarFpq417zzap9Sw\n", "VazOoMnvVps=\n");

    /* JADX INFO: renamed from: ষ, reason: contains not printable characters */
    public static final String f2293 = StringFog.decrypt("sqa/IUMOh/y1rrchQx+R/v+nt3hcCYL0o638f0INjPCj559NfAmC9KOthGZKCZrUsr27eUcYjA==\n", "0cnSDy5s9ZU=\n");

    /* JADX INFO: renamed from: ঘ, reason: contains not printable characters */
    public static final String f2292 = StringFog.decrypt("hPRAYik3jc6w/Ed+\n", "xpUzB2hU+ac=\n");

    /* JADX INFO: renamed from: খ, reason: contains not printable characters */
    public static final String f2291 = StringFog.decrypt("RYveFrZveE5Cg9YWtn5uTAiK1k+paH1GVICdSLdsc0JUyvFZqGhLRFKNxVGvdA==\n", "JuSzONsNCic=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(StringFog.decrypt("QtwzRcPsK31CyyZk+cYU\n", "JblHCKqCXxg=\n"), new C1034(this));
        map.put(f2350, new C1012(this));
        map.put(StringFog.decrypt("YSbOvBhDzfNhJvSNFEU=\n", "BkO67HkgppI=\n"), new C1003(this));
        map.put(StringFog.decrypt("OuF4i2wPaOII9mA=\n", "XYQMyABmC4k=\n"), new C0989(this));
        map.put(StringFog.decrypt("a9Lyxno3t2d1x+M=\n", "DLeGihNZ3DM=\n"), new C0967(this));
        map.put(StringFog.decrypt("RvlBBmEJL0d07lk=\n", "IZw1TwxoSCI=\n"), new C0962(this));
        map.put(StringFog.decrypt("BLvjZreC+ZwRsg==\n", "Y96XL9Ttl8k=\n"), new C0956(this));
        map.put(StringFog.decrypt("Mid8/KPKBQ==\n", "VUIIvceDYTo=\n"), new C0917(this));
        map.put(f2349, new C0906(this));
        map.put(StringFog.decrypt("+ae5r8ao++X7lKSFwrPG4f+hpojJu8Hn7Kujhg==\n", "nsLN4afckpM=\n"), new C1086(this));
        map.put(StringFog.decrypt("qMH7ui0BZDyp8uadOy5uFbLX+50iCng=\n", "26SP+ExvClk=\n"), new C1085(this));
        map.put(StringFog.decrypt("QZ3KUkgScIVD\n", "Jvi+EyxGCfU=\n"), new C1041(this));
        return map;
    }

    public C0868(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:311:0x05c9  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2128525576:
                if (str.equals(f2323)) {
                    b = 40;
                } else {
                    b = -1;
                }
                break;
            case -2127096804:
                if (str.equals(f2333)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -2107186802:
                if (str.equals(StringFog.decrypt("TXfliYXbNuZPf+KUltAS8A==\n", "AxaR4PO+d4I=\n"))) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case -2088438133:
                if (str.equals(f2302)) {
                    b = 80;
                } else {
                    b = -1;
                }
                break;
            case -2083223016:
                if (str.equals(f2340)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -2030516682:
                if (str.equals(f2304)) {
                    b = 76;
                } else {
                    b = -1;
                }
                break;
            case -1980005015:
                if (str.equals(StringFog.decrypt("CRf12VUjY8AsE/DiWShg\n", "XnKXjzxGFIY=\n"))) {
                    b = 47;
                } else {
                    b = -1;
                }
                break;
            case -1978654101:
                if (str.equals(f2318)) {
                    b = 51;
                } else {
                    b = -1;
                }
                break;
            case -1969670564:
                if (str.equals(f2298)) {
                    b = 88;
                } else {
                    b = -1;
                }
                break;
            case -1940754118:
                if (str.equals(StringFog.decrypt("GkBfQu+/3I8RcW1V6bfJki9b\n", "WyIsNp3ev/s=\n"))) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1919192581:
                if (str.equals(StringFog.decrypt("YteGXEYqjoRc96hhQT+Ht0z3qGNBKpI=\n", "L4PBFShe6/Y=\n"))) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -1876403509:
                if (str.equals(f2328)) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case -1874906197:
                if (str.equals(StringFog.decrypt("HZ0rEtHPzts8oiQVwO3S3hOVNwLiwdnN\n", "UPRFZrSovLo=\n"))) {
                    b = 71;
                } else {
                    b = -1;
                }
                break;
            case -1812546352:
                if (str.equals(f2305)) {
                    b = 74;
                } else {
                    b = -1;
                }
                break;
            case -1766796574:
                if (str.equals(StringFog.decrypt("UlaTp2f3duZ9VIynf/Vu/W9DgqB04A==\n", "HDfnzhGSIpQ=\n"))) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case -1702626105:
                if (str.equals(StringFog.decrypt("cpFPUXY0p2lTrkhBdjyDYVqP\n", "P/ghJRNT1Qg=\n"))) {
                    b = 69;
                } else {
                    b = -1;
                }
                break;
            case -1674303146:
                if (str.equals(f2348)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -1656370481:
                if (str.equals(StringFog.decrypt("skj14IETwGSyRPnSvhfZ\n", "5SGbhNdyrgE=\n"))) {
                    b = 65;
                } else {
                    b = -1;
                }
                break;
            case -1537112313:
                if (str.equals(StringFog.decrypt("jMPl8KErER+xztT/riIRE7386/u3\n", "36qCnsBHRnY=\n"))) {
                    b = 94;
                } else {
                    b = -1;
                }
                break;
            case -1522474666:
                if (str.equals(f2296)) {
                    b = 96;
                } else {
                    b = -1;
                }
                break;
            case -1507367077:
                if (str.equals(f2339)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -1458291270:
                if (str.equals(f2345)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case -1325137233:
                if (str.equals(f2346)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -1265212384:
                if (str.equals(StringFog.decrypt("uAeCgbsPQU+YC7KKuDVqS5w=\n", "627l79pjAy4=\n"))) {
                    b = 92;
                } else {
                    b = -1;
                }
                break;
            case -1077685820:
                if (str.equals(f2315)) {
                    b = 56;
                } else {
                    b = -1;
                }
                break;
            case -1061727315:
                if (str.equals(f2336)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case -1058625022:
                if (str.equals(StringFog.decrypt("nPgpYbckoNu85TxutTyr6o7yOmagIZXA\n", "z5FOD9ZI4bk=\n"))) {
                    b = 91;
                } else {
                    b = -1;
                }
                break;
            case -931831919:
                if (str.equals(f2338)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -920590771:
                if (str.equals(StringFog.decrypt("rOgIyuZG5o6NwgnQ90D9gYTzMNfmVg==\n", "4YFmvoMhlO8=\n"))) {
                    b = 81;
                } else {
                    b = -1;
                }
                break;
            case -894298414:
                if (str.equals(StringFog.decrypt("5Gpn118WQEvFT2jNXhhcTflibsZsGFdd\n", "qQMJozpxMio=\n"))) {
                    b = 85;
                } else {
                    b = -1;
                }
                break;
            case -811615267:
                if (str.equals(f2301)) {
                    b = 82;
                } else {
                    b = -1;
                }
                break;
            case -667901878:
                if (str.equals(StringFog.decrypt("RBemhbAOAL5lNv20uw0xvnsanpiwHg==\n", "CX7I8dVpct8=\n"))) {
                    b = 83;
                } else {
                    b = -1;
                }
                break;
            case -558926374:
                if (str.equals(f2300)) {
                    b = 84;
                } else {
                    b = -1;
                }
                break;
            case -495785498:
                if (str.equals(f2294)) {
                    b = 98;
                } else {
                    b = -1;
                }
                break;
            case -464794090:
                if (str.equals(f2332)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case -461263347:
                if (str.equals(f2326)) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case -396369642:
                if (str.equals(f2295)) {
                    b = 97;
                } else {
                    b = -1;
                }
                break;
            case -249445036:
                if (str.equals(f2327)) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case -228661957:
                if (str.equals(f2306)) {
                    b = 72;
                } else {
                    b = -1;
                }
                break;
            case -201859056:
                if (str.equals(f2313)) {
                    b = 61;
                } else {
                    b = -1;
                }
                break;
            case -156796625:
                if (str.equals(StringFog.decrypt("liFbeHYXiqK3ClR/diaRpqw=\n", "20g1DBNw+MM=\n"))) {
                    b = 77;
                } else {
                    b = -1;
                }
                break;
            case -126256187:
                if (str.equals(StringFog.decrypt("WODCcYgL3t916MR1kgLf22M=\n", "EaStBuZnsb4=\n"))) {
                    b = 59;
                } else {
                    b = -1;
                }
                break;
            case -121577375:
                if (str.equals(StringFog.decrypt("6j863zti8IPLJRDg\n", "p3ZUq14FguI=\n"))) {
                    b = 52;
                } else {
                    b = -1;
                }
                break;
            case -75274960:
                if (str.equals(StringFog.decrypt("dskWygSZUoA=\n", "Nah7umXwNe4=\n"))) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -33766813:
                if (str.equals(StringFog.decrypt("Vl31ivCo50RrWuCD1LL3SHB/6Jz2vv1IbQ==\n", "HzOB74Lbky0=\n"))) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 148631506:
                if (str.equals(f2344)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 154057692:
                if (str.equals(StringFog.decrypt("x5jMQW5D5THmks1beFD2Pvk=\n", "itGiNQskl1A=\n"))) {
                    b = 53;
                } else {
                    b = -1;
                }
                break;
            case 329817920:
                if (str.equals(StringFog.decrypt("Q2lJJ5VPcoZ1aVEKjlhQin9pTA==\n", "EQw+RucrJO8=\n"))) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case 336960212:
                if (str.equals(StringFog.decrypt("2MmyQFnAS0LOxrZE\n", "m6jfMDipLCw=\n"))) {
                    b = 43;
                } else {
                    b = -1;
                }
                break;
            case 388542383:
                if (str.equals(f2322)) {
                    b = 41;
                } else {
                    b = -1;
                }
                break;
            case 522506349:
                if (str.equals(StringFog.decrypt("BAGiOfuBVxQEAaMr1bVGHyQBsiU=\n", "UmjGXJTWMnY=\n"))) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 604727084:
                if (str.equals(StringFog.decrypt("NNkk5lDIhSkp3jHv\n", "XbdQgyK78UA=\n"))) {
                    b = 60;
                } else {
                    b = -1;
                }
                break;
            case 675209731:
                if (str.equals(StringFog.decrypt("NPVnjfW8bQcy7A==\n", "d5QK/ZTVCmk=\n"))) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 713779451:
                if (str.equals(StringFog.decrypt("iJgZpe8g8t+pshu46SzN16uYNLD4I9bXoIY=\n", "xfF30YpHgL4=\n"))) {
                    b = 79;
                } else {
                    b = -1;
                }
                break;
            case 745946635:
                if (str.equals(StringFog.decrypt("zr98j99hTmvzqm2IzHY=\n", "gN4I5qkEAgI=\n"))) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case 751945826:
                if (str.equals(f2299)) {
                    b = 86;
                } else {
                    b = -1;
                }
                break;
            case 787683072:
                if (str.equals(f2319)) {
                    b = 50;
                } else {
                    b = -1;
                }
                break;
            case 824636291:
                if (str.equals(StringFog.decrypt("rnux7fxEcqqCeor9+l5yvZNwq+38\n", "5xXFiI4SG84=\n"))) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case 830238336:
                if (str.equals(f2316)) {
                    b = 55;
                } else {
                    b = -1;
                }
                break;
            case 849576491:
                if (str.equals(StringFog.decrypt("j1IGsAaXL5quegyFAIQ0jatPEQ==\n", "wjtoxGPwXfs=\n"))) {
                    b = 33;
                } else {
                    b = -1;
                }
                break;
            case 879499863:
                if (str.equals(f2307)) {
                    b = 70;
                } else {
                    b = -1;
                }
                break;
            case 888727913:
                if (str.equals(StringFog.decrypt("UAJx4iSfYd9xGFvdB5lwynI5Zg==\n", "HUsflkH4E74=\n"))) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 892841421:
                if (str.equals(StringFog.decrypt("Z6xn0vU/w85Mu38=\n", "Jd4IpYZasZg=\n"))) {
                    b = 45;
                } else {
                    b = -1;
                }
                break;
            case 897829864:
                if (str.equals(StringFog.decrypt("TYzjNiQF25hmiOc=\n", "D+2QU3Nguc4=\n"))) {
                    b = 63;
                } else {
                    b = -1;
                }
                break;
            case 923005467:
                if (str.equals(f2347)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 963675317:
                if (str.equals(f2335)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 985183301:
                if (str.equals(StringFog.decrypt("5PtI+8WveXri81e0xOh6feP/C7jcoWRn4PpEucupemPo+gu3ybVyIMX1VrD/o3VY7vFS\n", "h5Ql1ajGFw4=\n"))) {
                    b = 93;
                } else {
                    b = -1;
                }
                break;
            case 989671232:
                if (str.equals(StringFog.decrypt("UIUkP2stf4hxois/ZzxorHOICSp8LluAeJs=\n", "HexKSw5KDek=\n"))) {
                    b = 73;
                } else {
                    b = -1;
                }
                break;
            case 1014009286:
                if (str.equals(StringFog.decrypt("6WnJIM+/AIXIQ8s9ybMxsOVWzjHd\n", "pACnVKrYcuQ=\n"))) {
                    b = 75;
                } else {
                    b = -1;
                }
                break;
            case 1027072306:
                if (str.equals(f2337)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 1031717908:
                if (str.equals(f2293)) {
                    b = 99;
                } else {
                    b = -1;
                }
                break;
            case 1074855404:
                if (str.equals(StringFog.decrypt("2yaMol4PaHf6H463Qgl4evMZi7NM\n", "lk/i1jtoGhY=\n"))) {
                    b = 87;
                } else {
                    b = -1;
                }
                break;
            case 1079743836:
                if (str.equals(f2297)) {
                    b = 89;
                } else {
                    b = -1;
                }
                break;
            case 1090486275:
                if (str.equals(f2308)) {
                    b = 68;
                } else {
                    b = -1;
                }
                break;
            case 1134055712:
                if (str.equals(f2292)) {
                    b = 100;
                } else {
                    b = -1;
                }
                break;
            case 1138147458:
                if (str.equals(f2314)) {
                    b = 57;
                } else {
                    b = -1;
                }
                break;
            case 1139753057:
                if (str.equals(StringFog.decrypt("6CAjOaBukHvHJD4o\n", "qkFQXOYc8Rw=\n"))) {
                    b = 44;
                } else {
                    b = -1;
                }
                break;
            case 1163838042:
                if (str.equals(f2334)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 1164173445:
                if (str.equals(StringFog.decrypt("HnLW7RpGu1IYesmiGwG4VRl2la4DSKZPGnParxRAuEsSc5W0HkGxUBxz3u0gRrtCK3zVpiBKt3AU\neMw=\n", "fR27w3cv1SY=\n"))) {
                    b = 95;
                } else {
                    b = -1;
                }
                break;
            case 1194888483:
                if (str.equals(f2331)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case 1253985693:
                if (str.equals(f2324)) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case 1297340448:
                if (str.equals(StringFog.decrypt("pNLVTsF2jrKZ1cBH/2yJr4jSxFk=\n", "7byhK7MF+ts=\n"))) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 1306792763:
                if (str.equals(f2342)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 1331885131:
                if (str.equals(StringFog.decrypt("SoLmvUNHDfBlme6vQ10T\n", "Bu2H2SoparE=\n"))) {
                    b = 58;
                } else {
                    b = -1;
                }
                break;
            case 1355875652:
                if (str.equals(f2310)) {
                    b = 66;
                } else {
                    b = -1;
                }
                break;
            case 1357502028:
                if (str.equals(StringFog.decrypt("cUTIbRMZ5D9fW+lvHRPLOA==\n", "MiulAHx3rko=\n"))) {
                    b = 49;
                } else {
                    b = -1;
                }
                break;
            case 1448823153:
                if (str.equals(StringFog.decrypt("L7lsvleU4icvuGujU5z1Kg==\n", "btsfyiX1gVM=\n"))) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 1491724830:
                if (str.equals(f2321)) {
                    b = 42;
                } else {
                    b = -1;
                }
                break;
            case 1505622627:
                if (str.equals(StringFog.decrypt("355WdyX81wvRlkttJeDzHQ==\n", "nf84GUCOlm8=\n"))) {
                    b = 90;
                } else {
                    b = -1;
                }
                break;
            case 1541095059:
                if (str.equals(f2329)) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case 1607057168:
                if (str.equals(StringFog.decrypt("AcbxYu9jyFM20/M=\n", "QLaBMIoArTo=\n"))) {
                    b = 48;
                } else {
                    b = -1;
                }
                break;
            case 1658563378:
                if (str.equals(f2291)) {
                    b = 101;
                } else {
                    b = -1;
                }
                break;
            case 1659288939:
                if (str.equals(f2325)) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 1704806948:
                if (str.equals(f2309)) {
                    b = 67;
                } else {
                    b = -1;
                }
                break;
            case 1746536452:
                if (str.equals(f2311)) {
                    b = 64;
                } else {
                    b = -1;
                }
                break;
            case 1792690910:
                if (str.equals(f2343)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case 1884374718:
                if (str.equals(f2341)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 1991923194:
                if (str.equals(f2317)) {
                    b = 54;
                } else {
                    b = -1;
                }
                break;
            case 2004707743:
                if (str.equals(f2303)) {
                    b = 78;
                } else {
                    b = -1;
                }
                break;
            case 2038381641:
                if (str.equals(f2330)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case 2095560678:
                if (str.equals(f2312)) {
                    b = 62;
                } else {
                    b = -1;
                }
                break;
            case 2118015322:
                if (str.equals(f2320)) {
                    b = 46;
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
                return MTGConfiguration.class;
            case 1:
                return MIntegralSDKFactory.class;
            case 2:
                return MTGRewardVideoActivity.class;
            case 3:
                return VideoWebViewActivity.class;
            case 4:
                return AbstractActivity.class;
            case 5:
                return AbstractJSActivity.class;
            case 6:
                return MTGActivity.class;
            case 7:
                return MTGCommonActivity.class;
            case 8:
                return MTGAuthorityActivity.class;
            case 9:
                return Campaign.class;
            case 10:
                return CampaignEx.class;
            case 11:
                return InterVideoOutListener.class;
            case 12:
                return InterstitialVideoListener.class;
            case 13:
                return RewardVideoListener.class;
            case 14:
                return MTGInterstitialActivity.class;
            case 15:
                return InterstitialListener.class;
            case 16:
            case 17:
                return MTGBannerView.class;
            case 18:
            case 19:
                return MTGBannerWebView.class;
            case 20:
                return MTGInterstitialHandler.class;
            case 21:
                return MTGInterstitialVideoHandler.class;
            case 22:
                return MTGRewardVideoHandler.class;
            case 23:
                return MTGBidInterstitialVideoHandler.class;
            case 24:
                return MTGBidRewardVideoHandler.class;
            case 25:
            case 26:
                return WallFragment.class;
            case 27:
                return NativeListener.class;
            case 28:
                return NativeListener.NativeTrackingListener.class;
            case 29:
                return NativeListener.NativeAdListener.class;
            case 30:
                return AppWallTrackingListener.class;
            case 31:
                return TabListFragment.class;
            case 32:
                return ShuffleFragment.class;
            case 33:
                return MintegralAdActivity.class;
            case 34:
                return BottomRefreshListView.class;
            case 35:
                return TabPageIndicator.class;
            case 36:
            case 37:
                return WallViewPager.class;
            case 38:
                return WallService.class;
            case 39:
                return ImpressionCampaignExModel.class;
            case 40:
                return TabListView.class;
            case 41:
            case 42:
                return WallView.class;
            case 43:
                return CampaignUnit.class;
            case 44:
                return BaseFragment.class;
            case 45:
            case 46:
                return BrowserView.class;
            case 47:
                return WebViewFragment.class;
            case 48:
                return AppReceiver.class;
            case 49:
                return CommonJumpLoader.class;
            case 50:
            case 51:
                return MTGImageView.class;
            case 52:
                return MIntegralSDK.class;
            case 53:
                return MIntegralConstans.class;
            case 54:
                return RoverCampaignUnit.class;
            case 55:
                return MtgWallHandler.class;
            case 56:
                return MTGOfferWallHandler.class;
            case 57:
                return MtgBidCommonHandler.class;
            case 58:
                return LoadingActivity.class;
            case 59:
                return IDownloadListener.class;
            case 60:
                return interstitial.class;
            case 61:
                return BidManager.class;
            case 62:
                return BidResponsed.class;
            case 63:
            case 64:
                return BaseWebView.class;
            case 65:
            case 66:
                return WindVaneWebView.class;
            case 67:
            case 68:
                return MTGAlertDialog.class;
            case 69:
            case 70:
                return MintegralVideoView.class;
            case 71:
            case 72:
                return MintegralVastEndCardView.class;
            case 73:
            case 74:
                return MintegralNativeEndCardView.class;
            case 75:
            case 76:
                return MintegralClickCTAView.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
            case 78:
                return MintegralBaseView.class;
            case TokenParametersOuterClass$TokenParameters.TIMEZONE_FIELD_NUMBER /* 79 */:
            case C5073y1.c /* 80 */:
                return MintegralClickMiniCardView.class;
            case 81:
            case 82:
                return MintegralContainerView.class;
            case 83:
            case 84:
                return MintegralH5EndCardView.class;
            case 85:
            case 86:
                return MintegralLandingPageView.class;
            case 87:
            case 88:
                return MintegralPlayableView.class;
            case 89:
                return OnMTGMediaViewListener.class;
            case 90:
                return BannerAdListener.class;
            case 91:
                return com.mintegral.msdk.video.signal.activity.AbstractJSActivity.class;
            case 92:
            case 93:
                return com.mintegral.msdk.mtgsignalcommon.base.BaseWebView.class;
            case 94:
            case 95:
                return com.mintegral.msdk.mtgsignalcommon.windvane.WindVaneWebView.class;
            case 96:
            case 97:
                return DomainMTGCommonActivity.class;
            case 98:
            case 99:
                return MBRewardVideoActivity.class;
            case 100:
            case 101:
                return BaseActivity.class;
            default:
                return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final String mo342() {
        C0679 c0679 = C0891.m648().f2390;
        String strDecrypt = StringFog.decrypt("6wQjNyFn/5ihBSN9NWe17usE\n", "xS5/Uwo70cQ=\n");
        c0679.getClass();
        return C0679.m570((Object) null, MTGConfiguration.class, strDecrypt);
    }
}
