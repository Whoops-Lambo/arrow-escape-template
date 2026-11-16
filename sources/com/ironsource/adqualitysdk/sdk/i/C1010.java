package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.ironsource.C5073y1;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.UserDataManager;
import net.pubnative.lite.sdk.api.RequestManager;
import net.pubnative.lite.sdk.auction.AdSourceConfig;
import net.pubnative.lite.sdk.auction.Auction;
import net.pubnative.lite.sdk.auction.HyBidAdSource;
import net.pubnative.lite.sdk.auction.VastTagAdSource;
import net.pubnative.lite.sdk.banner.presenter.BannerPresenterFactory;
import net.pubnative.lite.sdk.banner.presenter.MraidAdPresenter;
import net.pubnative.lite.sdk.banner.presenter.VastAdPresenter;
import net.pubnative.lite.sdk.browser.BrowserManager;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastReceiver;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialBroadcastSender;
import net.pubnative.lite.sdk.interstitial.PNInterstitialAd;
import net.pubnative.lite.sdk.interstitial.activity.HyBidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.MraidInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.activity.VastInterstitialActivity;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterDecorator;
import net.pubnative.lite.sdk.interstitial.presenter.InterstitialPresenterFactory;
import net.pubnative.lite.sdk.interstitial.presenter.MraidInterstitialPresenter;
import net.pubnative.lite.sdk.interstitial.presenter.VastInterstitialPresenter;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdExt;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.AdvertisingInfo;
import net.pubnative.lite.sdk.models.RemoteConfigAppInfo;
import net.pubnative.lite.sdk.models.VASTtag;
import net.pubnative.lite.sdk.mraid.MRAIDBanner;
import net.pubnative.lite.sdk.mraid.MRAIDInterstitial;
import net.pubnative.lite.sdk.mraid.MRAIDView;
import net.pubnative.lite.sdk.presenter.AdPresenterDecorator;
import net.pubnative.lite.sdk.presenter.PresenterFactory;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedAd;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastReceiver;
import net.pubnative.lite.sdk.rewarded.HyBidRewardedBroadcastSender;
import net.pubnative.lite.sdk.rewarded.activity.HyBidRewardedActivity;
import net.pubnative.lite.sdk.rewarded.activity.VastRewardedActivity;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterDecorator;
import net.pubnative.lite.sdk.rewarded.presenter.RewardedPresenterFactory;
import net.pubnative.lite.sdk.rewarded.presenter.VastRewardedPresenter;
import net.pubnative.lite.sdk.views.HyBidAdView;
import net.pubnative.lite.sdk.views.HyBidBannerAdView;
import net.pubnative.lite.sdk.views.HyBidLeaderboardAdView;
import net.pubnative.lite.sdk.views.HyBidMRectAdView;
import net.pubnative.lite.sdk.views.PNAPIContentInfoView;
import net.pubnative.lite.sdk.views.PNAdView;
import net.pubnative.lite.sdk.views.PNBannerAdView;
import net.pubnative.lite.sdk.views.PNMRectAdView;
import net.pubnative.lite.sdk.views.PNWebView;
import net.pubnative.lite.sdk.visibility.ImpressionManager;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.VideoAdView;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickTracking;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFiles;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import net.pubnative.lite.sdk.vpaid.response.VastProcessor;
import net.pubnative.lite.sdk.vpaid.vast.ViewControllerVast;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᵏ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C1010 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f2962 = StringFog.decrypt("uyh5jV9nDva3KGM=\n", "3E0NzC8XWpk=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f2961 = StringFog.decrypt("o/aLNdgQkeOv4Y85yxSMxq4=\n", "yoXZUK9x44c=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f2960 = StringFog.decrypt("+3QUL4uqA8DJdSwQkboDwe1j\n", "iBFgeeLOZq8=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f2959 = StringFog.decrypt("6hZpeccSRzvj\n", "jXMdOKNYNFQ=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f2958 = StringFog.decrypt("Cc1ApbChC2MP3F2Ssasd\n", "bqg05NTieQY=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f2957 = StringFog.decrypt("2gmQ5b0BM9XJ\n", "vWzkpNlXUqY=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f2956 = StringFog.decrypt("iYZokAZx8AqLqng=\n", "7uMc0WIrn2Q=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f2955 = StringFog.decrypt("NWosedvYQVAz\n", "Ug9YOL+VJCQ=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f2954 = StringFog.decrypt("BXHTOmj3uX4HYA==\n", "YhSnewy2yg0=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f2953 = StringFog.decrypt("KnJNotSshBkueFeQ\n", "TRc547Du4Xg=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f2952 = StringFog.decrypt("49vteOqx2XPhysxL4g==\n", "hL6ZOY7wqgA=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f2951 = StringFog.decrypt("XziwTMHmZz1ZFbBgyQ==\n", "OF3EDaWiBkk=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f2950 = StringFog.decrypt("HXZhMr5D5F0bWWY=\n", "ehMVc9oHhSk=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f2949 = StringFog.decrypt("qfAL7lxJy6WvwA3D\n", "zpV/rzgNqtE=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f2948 = StringFog.decrypt("mKniU7zUK8yen+Jgsf4t/pap+nY=\n", "/8yWEtiQSrg=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f2947 = StringFog.decrypt("EHYHJfAGNSAlbQYh6yIFLhp3FiHqBhM=\n", "cwRiRIRjYWI=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f2946 = StringFog.decrypt("5S2cCguqfm/jJZsYG4h2c+U=\n", "gkjoS2/6Hx0=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f2945 = StringFog.decrypt("muUkdJ9LujSc7SN8nw==\n", "/YBQNfsb20Y=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f2944 = StringFog.decrypt("bnNcrBKQKGZoe1u7H6Qse1tzTIQEpSpgXGRE\n", "CRYo7XbASRQ=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f2943 = StringFog.decrypt("Y+ifXYq5a3Jl4JhZgI1JYXbpuXmKgHhlZ/m+boI=\n", "BI3rHO7pCgA=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f2942 = StringFog.decrypt("w1vJQ0UzcanFU85USAd1tOdS1GFKEA==\n", "pD69AiFjENs=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f2941 = StringFog.decrypt("Vzdm830SM8BRP2H3dyYR00I2Ud5wITnB\n", "MFISshlCUrI=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f2940 = StringFog.decrypt("ON0vWA2Fojs+1ShPALGmJhnRN3w8p686E9EobQ==\n", "X7hbGWnVw0k=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f2939 = StringFog.decrypt("7GyaB31u0cbqZJ0Dd1rz1fltuzR1ctnH/w==\n", "iwnuRhk+sLQ=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f2938 = StringFog.decrypt("k8hjz4ToPpyVwGQ=\n", "9K0XjuC4X+4=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f2937 = StringFog.decrypt("Thb9aCDAdVhqH+BdItdTW0AQ4moh1n9CThs=\n", "KXOJPkmkEDc=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f2936 = StringFog.decrypt("KIvQWu8TIQIMgs1v7QQHASaNz1j0FicGJoDDQO8EMA==\n", "T+6kDIZ3RG0=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f2935 = StringFog.decrypt("DatGtjG2gvsEp12bHbeb+QGaWocxrpXy\n", "as4y9V7b8po=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f2934 = StringFog.decrypt("q+jTiH6M1zel+8KIY4TGIqLkyKVNjcU=\n", "zI2nywzptkM=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f2933 = StringFog.decrypt("GTd8OXv+bLgbEXoVdOZsoBsh\n", "flIIcBWSBdY=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f2932 = StringFog.decrypt("18CqsxV65MLU9rGQBmr1wMLAv5Edf/Xw\n", "sKXe5XQJkIM=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f2931 = StringFog.decrypt("fmtmx06PbaRfZ37vf458sQ==\n", "GQ4SiivrBMU=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f2930 = StringFog.decrypt("CHIHmQ6MjcYMRRa5FZiLzApDFrIO\n", "bxdzynrt+a8=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f2929 = StringFog.decrypt("oFs6KKeqwomkbCsIvL7Eg6J9PB6yv9+Womo3C7Y=\n", "xz5Oe9PLtuA=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f2928 = StringFog.decrypt("GYkvo1l5FNcbnhiGTnkQzgiJKA==\n", "fuxb9CsYZKc=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f2927 = StringFog.decrypt("U8Qt68kiY01R0w/96BdSWWDAPunpCg==\n", "NKFZvLtDEz0=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f2926 = StringFog.decrypt("IiPnhcPV0oosMPaW0MLSkzYF4aPQxNqIIALystA=\n", "RUaTxrGws/4=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f2925 = StringFog.decrypt("B98QVH390i4JzAFHburSNxP/CmFm6tw0Dd8KY1n5wSk=\n", "YLpkFw+Ys1o=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f2924 = StringFog.decrypt("W9UX5VQ=\n", "E6xVjDDMK5U=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f2923 = StringFog.decrypt("WXeIIaqTDQ==\n", "GBPLQMn7aFo=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f2922 = StringFog.decrypt("crlt+MyO+nlqq2br74r8\n", "J8oIiojvjhg=\n");

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    public static final String f2921 = StringFog.decrypt("2wmBi9AQA6n9CryY2wIXpeA=\n", "kmTx+bVjcMA=\n");

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    public static final String f2920 = StringFog.decrypt("4wI0Hc/dTE7QCSQPz9w=\n", "sWdFaKquOAM=\n");

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    public static final String f2919 = StringFog.decrypt("M0y0Ounu5E4xR4kz9fs=\n", "cijnVZychys=\n");

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static final String f2918 = StringFog.decrypt("qaZ8Kz2ejt6OqkwhPA==\n", "4d8+Qlnf6o0=\n");

    /* JADX INFO: renamed from: ᐱ, reason: contains not printable characters */
    public static final String f2917 = StringFog.decrypt("Pie6ZiKh/isMFaZnBKP8\n", "aEbJEnbAmWo=\n");

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f2916 = StringFog.decrypt("mjBkC1V5DA==\n", "20UHfzwWYr8=\n");

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f2915 = StringFog.decrypt("3xAsGdLwOrX4AicZw+cYgfwSNhjF+w==\n", "nXFCd7eCasc=\n");

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    public static final String f2914 = StringFog.decrypt("ja/7ryueWESyuOmjIatZZg==\n", "wN2axk/fPBQ=\n");

    /* JADX INFO: renamed from: ე, reason: contains not printable characters */
    public static final String f2913 = StringFog.decrypt("om1GiKusgC2Rf1CSnq2i\n", "9Aw1/OrI0F8=\n");

    /* JADX INFO: renamed from: ງ, reason: contains not printable characters */
    public static final String f2912 = StringFog.decrypt("qx4xXfqpFLaIAj9N7L4=\n", "6WxeKonMZvs=\n");

    /* JADX INFO: renamed from: อ, reason: contains not printable characters */
    public static final String f2911 = StringFog.decrypt("Yf7dQNvaMqtM9exd1uc1vkXG+w==\n", "KYefKb+TXN8=\n");

    /* JADX INFO: renamed from: ม, reason: contains not printable characters */
    public static final String f2910 = StringFog.decrypt("FEvmW/TPqrA5QNdG+fKtpTBw1l3x4qelL0b2V/PjrbI5QA==\n", "XDKkMpCGxMQ=\n");

    /* JADX INFO: renamed from: น, reason: contains not printable characters */
    public static final String f2909 = StringFog.decrypt("AfcgCquUNmss/BEXpqkxfiXMEAyuuTt+OvoxBqG5PW0=\n", "SY5iY8/dWB8=\n");

    /* JADX INFO: renamed from: ต, reason: contains not printable characters */
    public static final String f2908 = StringFog.decrypt("qn/7gIdINqCOWMaHkkEFtw==\n", "+jGy7vMtRNM=\n");

    /* JADX INFO: renamed from: ฑ, reason: contains not printable characters */
    public static final String f2907 = StringFog.decrypt("a/qRpKBMoJdW/YStgk2xjUf6kaSge7GdTeaEtb1N\n", "IpTlwdI/1P4=\n");

    /* JADX INFO: renamed from: ঢ়, reason: contains not printable characters */
    public static final String f2906 = StringFog.decrypt("tiYQEXGW5uWLIQUYU5f3/5omEBFxo/PviycWDQ==\n", "/0hkdAPlkow=\n");

    /* JADX INFO: renamed from: ষ, reason: contains not printable characters */
    public static final String f2905 = StringFog.decrypt("tBA2Eryb+aGcECQPsab+tJUyJR6rt/mhnBA=\n", "+WJXe9jSl9U=\n");

    /* JADX INFO: renamed from: ঘ, reason: contains not printable characters */
    public static final String f2904 = StringFog.decrypt("HGY0HFDc4jg4dDMBbdv3MRp1Iht83OI4OA==\n", "SgdHaBmyll0=\n");

    /* JADX INFO: renamed from: খ, reason: contains not printable characters */
    public static final String f2903 = StringFog.decrypt("JiHCP9r8AtQpMN9nz6cM0zwhmGLO4k7TJjDTY9n9Cc4hJdo/y+oU0z4twmiEwRn4ISD/f97sEsk8\nLcJ4y+Uh2TwtwHje8A==\n", "SES2EaqJYLo=\n");

    /* JADX INFO: renamed from: এ, reason: contains not printable characters */
    public static final String f2902 = StringFog.decrypt("6Tjlh62njMrEM9SaoJqL380AxJqgmIvK2A==\n", "oUGn7snu4r4=\n");

    /* JADX INFO: renamed from: ऱ, reason: contains not printable characters */
    public static final String f2901 = StringFog.decrypt("sTg1o+18w2e+KSj7+CfNYKs4b/75Yo9gsSkk/+59yH22PC2j/GrVYKk0NfSzRNNotjkI4+ls03qr\nNDXk/GXgaqs0N+TpcA==\n", "311BjZ0JoQk=\n");

    /* JADX INFO: renamed from: ܟ, reason: contains not printable characters */
    public static final String f2900 = StringFog.decrypt("GahhoJXJQj4xqHO9mPRFKzibY72Y9kU+LQ==\n", "VNoAyfGALEo=\n");

    /* JADX INFO: renamed from: ܘ, reason: contains not printable characters */
    public static final String f2899 = StringFog.decrypt("YebJLAFtuVNu99R0FDa3VHvmk3EVc/VUYffYcAJssklm4tEsEHuvVHnqyXtfTrpOe8rTdhRqqElm\n99RjHVm4SWb11HYI\n", "D4O9AnEY2z0=\n");

    /* JADX INFO: renamed from: ے, reason: contains not printable characters */
    public static final String f2898 = StringFog.decrypt("NuWPxjXnIG8S94jbCOA1ZiHniNsK4CBz\n", "YIT8snyJVAo=\n");

    /* JADX INFO: renamed from: ۉ, reason: contains not printable characters */
    public static final String f2897 = StringFog.decrypt("JV0=\n", "ZDn2P0NHdGg=\n");

    /* JADX INFO: renamed from: ۅ, reason: contains not printable characters */
    public static final String f2896 = StringFog.decrypt("EYHzWNxt\n", "UOW3OagMhY4=\n");

    /* JADX INFO: renamed from: ڑ, reason: contains not printable characters */
    public static final String f2895 = StringFog.decrypt("wxIkpMM=\n", "gnZh3Le/a8s=\n");

    /* JADX INFO: renamed from: پ, reason: contains not printable characters */
    public static final String f2894 = StringFog.decrypt("BwKYmtia1Q81Aw==\n", "RmbK/6vqumE=\n");

    /* JADX INFO: renamed from: ٽ, reason: contains not printable characters */
    public static final String f2893 = StringFog.decrypt("VYtXy7ku0e59gUbnpTzX\n", "FO8hrstauJ0=\n");

    /* JADX INFO: renamed from: ث, reason: contains not printable characters */
    public static final String f2892 = StringFog.decrypt("FFfKYkxOcPMoVM5qeVtD1ShUyA==\n", "RjKnDTgrM5w=\n");

    /* JADX INFO: renamed from: ת, reason: contains not printable characters */
    public static final String f2891 = StringFog.decrypt("1Qq6utc0pQ==\n", "g0vp7qNVwsk=\n");

    /* JADX INFO: renamed from: ק, reason: contains not printable characters */
    public static final String f2890 = StringFog.decrypt("CjAGTaONgE8w\n", "R2JHBOfb6So=\n");

    /* JADX INFO: renamed from: פ, reason: contains not printable characters */
    public static final String f2889 = StringFog.decrypt("m2xDeNQ1XtGzTHFF+QhZxLo=\n", "1j4CMZB8MKU=\n");

    /* JADX INFO: renamed from: ս, reason: contains not printable characters */
    public static final String f2888 = StringFog.decrypt("4hmCXH9uB5fBLrE=\n", "r0vDFTssZvk=\n");

    /* JADX INFO: renamed from: ո, reason: contains not printable characters */
    public static final String f2887 = StringFog.decrypt("2vdy7FxGmKXv9lDaXFaSufrnTew=\n", "m5Minjk1/cs=\n");

    /* JADX INFO: renamed from: յ, reason: contains not printable characters */
    public static final String f2886 = StringFog.decrypt("/TyPD9mdAfzfCIsfyJwH4A==\n", "rU7qfLzzdZk=\n");

    /* JADX INFO: renamed from: Ն, reason: contains not printable characters */
    public static final String f2885 = StringFog.decrypt("DgHV/DlfWnMnCvPwOUxb\n", "RniXlV0NPwQ=\n");

    /* JADX INFO: renamed from: Ԇ, reason: contains not printable characters */
    public static final String f2884 = StringFog.decrypt("k3baOnxTxfO6ffw2fEPS67pr+zJrdfLhuGrxJX1z\n", "2w+YUxgBoIQ=\n");

    /* JADX INFO: renamed from: Ӵ, reason: contains not printable characters */
    public static final String f2883 = StringFog.decrypt("5Czw94utcKLNJ9b7i71nus0x0f+ci0awwjHX7A==\n", "rFWynu//FdU=\n");

    /* JADX INFO: renamed from: ӟ, reason: contains not printable characters */
    public static final String f2882 = StringFog.decrypt("lgXUjtXeAoeUEsacwtQThrYkxozIyAaXqxI=\n", "xGCj76e6Z+M=\n");

    /* JADX INFO: renamed from: Ҭ, reason: contains not printable characters */
    public static final String f2881 = StringFog.decrypt("lc41wvGWZVeX2SfQ5px0VrXtI8D3nXJK\n", "x6tCo4PyADM=\n");

    /* JADX INFO: renamed from: Ғ, reason: contains not printable characters */
    public static final String f2880 = StringFog.decrypt("RKu5djlbUbtgrq9mO0xDqXekvmcZ\n", "EsrKAms+Jto=\n");

    /* JADX INFO: renamed from: ѵ, reason: contains not printable characters */
    public static final String f2879 = StringFog.decrypt("hPaUTslRKZaL54kW3AonkZ72zhPdT2WKj+SBEt1BL9aL8JQJz00/gcTbmSLQQBmdnfKSBNxACpue\n+pYJzV0=\n", "6pPgYLkkS/g=\n");

    /* JADX INFO: renamed from: п, reason: contains not printable characters */
    public static final String f2878 = StringFog.decrypt("FxsGRpaMkyo+ECBKlp+VKTYULVuL\n", "X2JEL/Le9l0=\n");

    /* JADX INFO: renamed from: н, reason: contains not printable characters */
    public static final String f2877 = StringFog.decrypt("M/UJtTpyGh485BTtLykUGSn1U+gubFYCOOcc6S5iHF488wnyPG4MCXPGHOg+VR0HPOIZ/i5GGwQ0\n5hTvMw==\n", "XZB9m0oHeHA=\n");

    /* JADX INFO: renamed from: У, reason: contains not printable characters */
    public static final String f2876 = StringFog.decrypt("QNpRnWNraLlk30eNcG1rsWDSVpA=\n", "Frsi6TEOH9g=\n");

    /* JADX INFO: renamed from: С, reason: contains not printable characters */
    public static final String f2875 = StringFog.decrypt("Svm/0Fw2LIU=\n", "Grf+tApfSfI=\n");

    /* JADX INFO: renamed from: Ϲ, reason: contains not printable characters */
    public static final String f2874 = StringFog.decrypt("nb5Ezv6TvBm8onE=\n", "1ccGp5rS2E8=\n");

    /* JADX INFO: renamed from: ϵ, reason: contains not printable characters */
    public static final String f2873 = StringFog.decrypt("83+k7zp4XYPVY5THOmxViMw=\n", "uwbmhl46PO0=\n");

    /* JADX INFO: renamed from: ϯ, reason: contains not printable characters */
    public static final String f2872 = StringFog.decrypt("qRbRILpR91OFCuErsXzgVqALxSC7ag==\n", "4W+TSd4dkjI=\n");

    /* JADX INFO: renamed from: Ϯ, reason: contains not printable characters */
    public static final String f2871 = StringFog.decrypt("VkV7ANkQ+Xp9SHgN6zTOaA==\n", "Hjw5ab1dqx8=\n");

    /* JADX INFO: renamed from: ϝ, reason: contains not printable characters */
    public static final String f2870 = StringFog.decrypt("dHy39AFHgP9QV5jQAWqJ/nJbk9M=\n", "JDL2pEgE75E=\n");

    /* JADX INFO: renamed from: ϙ, reason: contains not printable characters */
    public static final String f2869 = StringFog.decrypt("oNyVTXvl+Oax9oFFcPw=\n", "8JLXLBWLnZQ=\n");

    /* JADX INFO: renamed from: Λ, reason: contains not printable characters */
    public static final String f2868 = StringFog.decrypt("Ackt5y7NyoE10QnQPA==\n", "UYdgtUuuvsA=\n");

    /* JADX INFO: renamed from: Κ, reason: contains not printable characters */
    public static final String f2867 = StringFog.decrypt("Idsbk2ij9ZQG\n", "cZVM9gr1nPE=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f2866 = StringFog.decrypt("5DEMYEPMng==\n", "slhoBSyN+vU=\n");

    /* JADX INFO: renamed from: ʜ, reason: contains not printable characters */
    public static final String f2865 = StringFog.decrypt("Ni7CFcLwQ7UJNNIVw9RV\n", "YEemcK2xJ/k=\n");

    /* JADX INFO: renamed from: Ȳ, reason: contains not printable characters */
    public static final String f2864 = StringFog.decrypt("3ShJxkXt5JbiJFo=\n", "i0EtoyqsgMA=\n");

    /* JADX INFO: renamed from: ȝ, reason: contains not printable characters */
    public static final String f2863 = StringFog.decrypt("2OXEXwdxNr7r98REJQ==\n", "joS3K1cDWd0=\n");

    /* JADX INFO: renamed from: ƈ, reason: contains not printable characters */
    public static final String f2862 = StringFog.decrypt("CCrzU+636G8+KQ==\n", "WEaSKovFoQE=\n");

    /* JADX INFO: renamed from: Ɔ, reason: contains not printable characters */
    public static final String f2861 = StringFog.decrypt("VEKAQXSvf495SbFceZJ4mnB6pmR5lWWecl6w\n", "HDvCKBDmEfs=\n");

    /* JADX INFO: renamed from: Ť, reason: contains not printable characters */
    public static final String f2860 = StringFog.decrypt("TVjhVWPkk+hkU8dZY/eS02xS11lp04Q=\n", "BSGjPAe29p8=\n");

    /* JADX INFO: renamed from: ţ, reason: contains not printable characters */
    public static final String f2859 = StringFog.decrypt("lKDkr/0JgWC1vNGK8DuRU7K81A==\n", "3NmmxplI5TY=\n");

    /* JADX INFO: renamed from: ō, reason: contains not printable characters */
    public static final String f2858 = StringFog.decrypt("Wq0fB3dAr2ZqoyAdZ0CuQnw=\n", "Du9JbhMlwCc=\n");

    /* JADX INFO: renamed from: Ł, reason: contains not printable characters */
    public static final String f2857 = StringFog.decrypt("69whhp0SNGY=\n", "qrhx5+9zWRU=\n");

    /* JADX INFO: renamed from: Ĵ, reason: contains not printable characters */
    public static final String f2856 = StringFog.decrypt("G3EW53bJGnE/dx/8UNQiZD5s\n", "TRhzkDWmdAU=\n");

    /* JADX INFO: renamed from: ﾓ, reason: contains not printable characters */
    public static final String f2981 = StringFog.decrypt("/rhegSZ/0mLHv06WJlLaRNo=\n", "qNE65Ek+tiE=\n");

    /* JADX INFO: renamed from: ﾊ, reason: contains not printable characters */
    public static final String f2980 = StringFog.decrypt("V1oI+A2uOjViWB8=\n", "ATNsnWLtVlw=\n");

    /* JADX INFO: renamed from: ﾁ, reason: contains not printable characters */
    public static final String f2979 = StringFog.decrypt("myDjdWk2GDC3Oe1+\n", "2EyKFgJicEI=\n");

    /* JADX INFO: renamed from: ｽ, reason: contains not printable characters */
    public static final String f2978 = StringFog.decrypt("Bb8HhgPc+fcluAeLDw==\n", "RtNu5WiIi5Y=\n");

    /* JADX INFO: renamed from: ｹ, reason: contains not printable characters */
    public static final String f2977 = StringFog.decrypt("go5vqrq+uoyv\n", "weEC2tvQ0+M=\n");

    /* JADX INFO: renamed from: ｸ, reason: contains not printable characters */
    public static final String f2976 = StringFog.decrypt("r/ZZyG4dKmuC2FDL\n", "7Jk0uA9zQwQ=\n");

    /* JADX INFO: renamed from: ｷ, reason: contains not printable characters */
    public static final String f2975 = StringFog.decrypt("Mgmsv9Y4qYsfJa2m1D2UjAMJtKjf\n", "cWbBz7dWwOQ=\n");

    /* JADX INFO: renamed from: ｳ, reason: contains not printable characters */
    public static final String f2974 = StringFog.decrypt("YClsbr8NpnRNBW13vQibaUIlanewBA==\n", "I0YBHt5jzxs=\n");

    /* JADX INFO: renamed from: ｦ, reason: contains not printable characters */
    public static final String f2973 = StringFog.decrypt("739TCCon0Qw=\n", "rA02aV5Op2k=\n");

    /* JADX INFO: renamed from: ｓ, reason: contains not printable characters */
    public static final String f2972 = StringFog.decrypt("DYeMI4stoJs9\n", "TvXpQv9E1v4=\n");

    /* JADX INFO: renamed from: ｒ, reason: contains not printable characters */
    public static final String f2971 = StringFog.decrypt("XFMnWN3v\n", "FT1rMbOKwGo=\n");

    /* JADX INFO: renamed from: ｎ, reason: contains not printable characters */
    public static final String f2970 = StringFog.decrypt("VoaxLZrKTqp1laE8\n", "AOfCWduuHcU=\n");

    /* JADX INFO: renamed from: ｌ, reason: contains not printable characters */
    public static final String f2969 = StringFog.decrypt("MlsiUScNvw0a\n", "fz5GOEZL1mE=\n");

    /* JADX INFO: renamed from: Ｉ, reason: contains not printable characters */
    public static final String f2968 = StringFog.decrypt("QMXyBSlYnTJo0w==\n", "DaCWbEge9F4=\n");

    /* JADX INFO: renamed from: Ｆ, reason: contains not printable characters */
    public static final String f2967 = StringFog.decrypt("X6ps/pdUww5/sXj4nVI=\n", "DN4Niv43kWs=\n");

    /* JADX INFO: renamed from: ﻢ, reason: contains not printable characters */
    public static final String f2966 = StringFog.decrypt("60N9eA==\n", "vSIODASEzag=\n");

    /* JADX INFO: renamed from: ﻌ, reason: contains not printable characters */
    public static final String f2965 = StringFog.decrypt("UquAQCy87A==\n", "BdnhMFzZns0=\n");

    /* JADX INFO: renamed from: ﻋ, reason: contains not printable characters */
    public static final String f2964 = StringFog.decrypt("b/V3bmDlrJJe4XZz\n", "ObQkOiGB+PM=\n");

    /* JADX INFO: renamed from: ﺧ, reason: contains not printable characters */
    public static final String f2963 = StringFog.decrypt("aW0WOlzASu96fgE6Rdo=\n", "Kh9zWyipPIo=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f2962, new C0964(this));
        map.put(f2961, new C0550(this));
        map.put(f2960, new C0418(this));
        map.put(f2959, new C1318(this));
        map.put(f2958, new C1293(this));
        map.put(f2957, new C1272(this));
        map.put(f2956, new C1267(this));
        map.put(f2955, new C1260(this));
        map.put(f2954, new C1202(this));
        map.put(f2953, new C1027(this));
        map.put(f2952, new C1005(this));
        map.put(f2951, new C1004(this));
        map.put(f2950, new C1000(this));
        map.put(f2949, new C0998(this));
        map.put(f2948, new C0996(this));
        map.put(f2947, new C0993(this));
        map.put(f2946, new C0981(this));
        map.put(f2945, new C0980(this));
        map.put(f2944, new C0976(this));
        map.put(f2943, new C0885(this));
        map.put(f2942, new C0848(this));
        map.put(f2941, new C0844(this));
        map.put(f2940, new C0809(this));
        map.put(f2939, new C0791(this));
        map.put(f2938, new C0747(this));
        map.put(f2937, new C0732(this));
        map.put(f2936, new C0691(this));
        map.put(f2935, new C0658(this));
        map.put(f2934, new C0639(this));
        map.put(f2933, new C0543(this));
        map.put(f2932, new C0513(this));
        map.put(f2931, new C0466(this));
        map.put(f2930, new C0462(this));
        map.put(f2929, new C0447(this));
        map.put(f2928, new C0446(this));
        map.put(f2927, new C0437(this));
        map.put(f2926, new C0435(this));
        map.put(f2925, new C0421(this));
        return map;
    }

    public C1010(String str) {
        super(str);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        return HyBid.getHyBidVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:269:0x0418  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2115104349:
                if (str.equals(f2864)) {
                    b = 60;
                } else {
                    b = -1;
                }
                break;
            case -2101083431:
                if (str.equals(f2971)) {
                    b = 79;
                } else {
                    b = -1;
                }
                break;
            case -2095699225:
                if (str.equals(f2898)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case -2049897434:
                if (str.equals(f2980)) {
                    b = 70;
                } else {
                    b = -1;
                }
                break;
            case -2030915791:
                if (str.equals(f2877)) {
                    b = 47;
                } else {
                    b = -1;
                }
                break;
            case -2022878658:
                if (str.equals(f2920)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case -1973009238:
                if (str.equals(f2970)) {
                    b = 80;
                } else {
                    b = -1;
                }
                break;
            case -1867123455:
                if (str.equals(f2879)) {
                    b = 45;
                } else {
                    b = -1;
                }
                break;
            case -1758764491:
                if (str.equals(f2963)) {
                    b = 87;
                } else {
                    b = -1;
                }
                break;
            case -1741983831:
                if (str.equals(f2857)) {
                    b = 67;
                } else {
                    b = -1;
                }
                break;
            case -1692490108:
                if (str.equals(f2972)) {
                    b = 78;
                } else {
                    b = -1;
                }
                break;
            case -1668741680:
                if (str.equals(f2904)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -1474059205:
                if (str.equals(f2867)) {
                    b = 57;
                } else {
                    b = -1;
                }
                break;
            case -1454339106:
                if (str.equals(f2909)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case -1305745411:
                if (str.equals(f2885)) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case -1042733280:
                if (str.equals(f2919)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -1040143378:
                if (str.equals(f2914)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case -1034806157:
                if (str.equals(f2965)) {
                    b = 85;
                } else {
                    b = -1;
                }
                break;
            case -1007287447:
                if (str.equals(f2878)) {
                    b = 46;
                } else {
                    b = -1;
                }
                break;
            case -917597044:
                if (str.equals(f2901)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case -889171374:
                if (str.equals(f2900)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case -844922724:
                if (str.equals(f2890)) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case -801627293:
                if (str.equals(f2888)) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case -747024196:
                if (str.equals(f2883)) {
                    b = 41;
                } else {
                    b = -1;
                }
                break;
            case -729230458:
                if (str.equals(f2863)) {
                    b = 61;
                } else {
                    b = -1;
                }
                break;
            case -709708726:
                if (str.equals(f2918)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case -617879491:
                if (str.equals(f2979)) {
                    b = 71;
                } else {
                    b = -1;
                }
                break;
            case -594285390:
                if (str.equals(f2865)) {
                    b = 59;
                } else {
                    b = -1;
                }
                break;
            case -589715152:
                if (str.equals(f2870)) {
                    b = 54;
                } else {
                    b = -1;
                }
                break;
            case -587420703:
                if (str.equals(f2964)) {
                    b = 86;
                } else {
                    b = -1;
                }
                break;
            case -567645543:
                if (str.equals(f2872)) {
                    b = 52;
                } else {
                    b = -1;
                }
                break;
            case -520974940:
                if (str.equals(f2894)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case -514201671:
                if (str.equals(f2913)) {
                    b = 11;
                } else {
                    b = -1;
                }
                break;
            case -385055469:
                if (str.equals(f2968)) {
                    b = 82;
                } else {
                    b = -1;
                }
                break;
            case -348198615:
                if (str.equals(f2975)) {
                    b = 75;
                } else {
                    b = -1;
                }
                break;
            case -242952691:
                if (str.equals(f2908)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case -232966702:
                if (str.equals(f2893)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case -217201711:
                if (str.equals(f2860)) {
                    b = 64;
                } else {
                    b = -1;
                }
                break;
            case -205981873:
                if (str.equals(f2862)) {
                    b = 62;
                } else {
                    b = -1;
                }
                break;
            case -150968480:
                if (str.equals(f2969)) {
                    b = 81;
                } else {
                    b = -1;
                }
                break;
            case -133293208:
                if (str.equals(f2859)) {
                    b = 65;
                } else {
                    b = -1;
                }
                break;
            case -114588646:
                if (str.equals(f2981)) {
                    b = 69;
                } else {
                    b = -1;
                }
                break;
            case 2115:
                if (str.equals(f2897)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case 2658924:
                if (str.equals(f2966)) {
                    b = 84;
                } else {
                    b = -1;
                }
                break;
            case 22955995:
                if (str.equals(f2868)) {
                    b = 56;
                } else {
                    b = -1;
                }
                break;
            case 63078110:
                if (str.equals(f2895)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 70165004:
                if (str.equals(f2924)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case 152629510:
                if (str.equals(f2875)) {
                    b = 49;
                } else {
                    b = -1;
                }
                break;
            case 254077974:
                if (str.equals(f2887)) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case 271735736:
                if (str.equals(f2922)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 282218207:
                if (str.equals(f2907)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 287435653:
                if (str.equals(f2912)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case 353872196:
                if (str.equals(f2921)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case 378666444:
                if (str.equals(f2917)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 424904237:
                if (str.equals(f2856)) {
                    b = 68;
                } else {
                    b = -1;
                }
                break;
            case 441957133:
                if (str.equals(f2871)) {
                    b = 53;
                } else {
                    b = -1;
                }
                break;
            case 476474561:
                if (str.equals(f2903)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case 482776408:
                if (str.equals(f2910)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case 485976319:
                if (str.equals(f2923)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 504900231:
                if (str.equals(f2902)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 591135468:
                if (str.equals(f2977)) {
                    b = 73;
                } else {
                    b = -1;
                }
                break;
            case 606183598:
                if (str.equals(f2906)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case 676623548:
                if (str.equals(f2967)) {
                    b = 83;
                } else {
                    b = -1;
                }
                break;
            case 767767497:
                if (str.equals(f2876)) {
                    b = 48;
                } else {
                    b = -1;
                }
                break;
            case 789926062:
                if (str.equals(f2915)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case 862687632:
                if (str.equals(f2881)) {
                    b = 43;
                } else {
                    b = -1;
                }
                break;
            case 956069326:
                if (str.equals(f2891)) {
                    b = 33;
                } else {
                    b = -1;
                }
                break;
            case 1002796579:
                if (str.equals(f2916)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 1044987291:
                if (str.equals(f2911)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case 1150879268:
                if (str.equals(f2976)) {
                    b = 74;
                } else {
                    b = -1;
                }
                break;
            case 1164559907:
                if (str.equals(f2889)) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case 1199380782:
                if (str.equals(f2880)) {
                    b = 44;
                } else {
                    b = -1;
                }
                break;
            case 1228519789:
                if (str.equals(f2899)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case 1241891335:
                if (str.equals(f2892)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case 1250739860:
                if (str.equals(f2874)) {
                    b = 50;
                } else {
                    b = -1;
                }
                break;
            case 1296210799:
                if (str.equals(f2861)) {
                    b = 63;
                } else {
                    b = -1;
                }
                break;
            case 1373883333:
                if (str.equals(f2905)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 1402445010:
                if (str.equals(f2869)) {
                    b = 55;
                } else {
                    b = -1;
                }
                break;
            case 1506578400:
                if (str.equals(f2873)) {
                    b = 51;
                } else {
                    b = -1;
                }
                break;
            case 1521679714:
                if (str.equals(f2886)) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 1607572150:
                if (str.equals(f2884)) {
                    b = 40;
                } else {
                    b = -1;
                }
                break;
            case 1877773523:
                if (str.equals(f2974)) {
                    b = 76;
                } else {
                    b = -1;
                }
                break;
            case 1885066191:
                if (str.equals(f2973)) {
                    b = 77;
                } else {
                    b = -1;
                }
                break;
            case 1955369613:
                if (str.equals(f2896)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case 1969459009:
                if (str.equals(f2882)) {
                    b = 42;
                } else {
                    b = -1;
                }
                break;
            case 2079062148:
                if (str.equals(f2858)) {
                    b = 66;
                } else {
                    b = -1;
                }
                break;
            case 2107600959:
                if (str.equals(f2978)) {
                    b = 72;
                } else {
                    b = -1;
                }
                break;
            case 2117435870:
                if (str.equals(f2866)) {
                    b = 58;
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
                return HyBid.class;
            case 1:
                return AdCache.class;
            case 2:
                return UserDataManager.class;
            case 3:
                return ImpressionManager.class;
            case 4:
                return RequestManager.class;
            case 5:
                return AdSourceConfig.class;
            case 6:
                return HyBidAdSource.class;
            case 7:
                return VastTagAdSource.class;
            case 8:
                return Auction.class;
            case 9:
                return BannerPresenterFactory.class;
            case 10:
                return MraidAdPresenter.class;
            case 11:
                return VastAdPresenter.class;
            case 12:
                return BrowserManager.class;
            case 13:
                return HyBidInterstitialAd.class;
            case 14:
                return HyBidInterstitialBroadcastReceiver.class;
            case 15:
                return HyBidInterstitialBroadcastSender.class;
            case 16:
                return PNInterstitialAd.class;
            case 17:
                return InterstitialPresenterDecorator.class;
            case 18:
                return InterstitialPresenterFactory.class;
            case 19:
                return MraidInterstitialPresenter.class;
            case 20:
                return VastInterstitialPresenter.class;
            case 21:
            case 22:
                return HyBidInterstitialActivity.class;
            case 23:
            case 24:
                return MraidInterstitialActivity.class;
            case 25:
            case 26:
                return VastInterstitialActivity.class;
            case 27:
                return Ad.class;
            case 28:
                return AdData.class;
            case 29:
                return AdExt.class;
            case 30:
                return AdResponse.class;
            case 31:
                return AdvertisingInfo.class;
            case 32:
                return RemoteConfigAppInfo.class;
            case 33:
                return VASTtag.class;
            case 34:
                return MRAIDView.class;
            case 35:
                return MRAIDInterstitial.class;
            case 36:
                return MRAIDBanner.class;
            case 37:
                return AdPresenterDecorator.class;
            case 38:
                return PresenterFactory.class;
            case 39:
                return HyBidRewardedAd.class;
            case 40:
                return HyBidRewardedBroadcastReceiver.class;
            case 41:
                return HyBidRewardedBroadcastSender.class;
            case 42:
                return RewardedPresenterDecorator.class;
            case 43:
                return RewardedPresenterFactory.class;
            case 44:
                return VastRewardedPresenter.class;
            case 45:
            case 46:
                return HyBidRewardedActivity.class;
            case 47:
            case 48:
                return VastRewardedActivity.class;
            case 49:
                return PNAdView.class;
            case 50:
                return HyBidAdView.class;
            case 51:
                return HyBidBannerAdView.class;
            case 52:
                return HyBidLeaderboardAdView.class;
            case 53:
                return HyBidMRectAdView.class;
            case 54:
                return PNAPIContentInfoView.class;
            case 55:
                return PNBannerAdView.class;
            case 56:
                return PNMRectAdView.class;
            case 57:
                return PNWebView.class;
            case 58:
                return VideoAd.class;
            case 59:
                return VideoAdListener.class;
            case 60:
                return VideoAdView.class;
            case 61:
                return VastProcessor.class;
            case 62:
                return PlayerInfo.class;
            case 63:
                return HyBidInterstitialAd.Listener.class;
            case 64:
                return HyBidRewardedAd.Listener.class;
            case 65:
                return HyBidAdView.Listener.class;
            case 66:
                return C1131.class;
            case 67:
                return AdParams.class;
            case 68:
                return ViewControllerVast.class;
            case 69:
                return VideoAdController.class;
            case 70:
                return VideoClicks.class;
            case 71:
                return ClickThrough.class;
            case 72:
                return ClickTracking.class;
            case 73:
                return Companion.class;
            case 74:
                return CompanionAds.class;
            case 75:
                return CompanionClickThrough.class;
            case 76:
                return CompanionClickTracking.class;
            case TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER /* 77 */:
                return Creative.class;
            case 78:
                return Creatives.class;
            case TokenParametersOuterClass$TokenParameters.TIMEZONE_FIELD_NUMBER /* 79 */:
                return InLine.class;
            case C5073y1.c /* 80 */:
                return VastAdSource.class;
            case 81:
                return MediaFile.class;
            case 82:
                return MediaFiles.class;
            case 83:
                return StaticResource.class;
            case 84:
                return Vast.class;
            case 85:
                return Wrapper.class;
            case 86:
                return VASTAdTagURI.class;
            case 87:
                return CreativeParams.class;
            default:
                return null;
        }
    }
}
