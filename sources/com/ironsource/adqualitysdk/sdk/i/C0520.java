package com.ironsource.adqualitysdk.sdk.i;

import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidAdView;
import com.explorestack.iab.mraid.MraidDialogActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidInterstitialListener;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.mraid.MraidViewListener;
import com.explorestack.iab.vast.VastViewListener;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.protobuf.adcom.Ad;
import com.ironsource.adqualitysdk.sdk.StringFog;
import io.bidmachine.richmedia.RichMediaListener;
import io.bidmachine.richmedia.RichMediaView;
import io.p071bidmachine.AdContentType;
import io.p071bidmachine.AdFullScreenListener;
import io.p071bidmachine.AdListener;
import io.p071bidmachine.AdRequest;
import io.p071bidmachine.AdRequestParameters;
import io.p071bidmachine.AdView;
import io.p071bidmachine.AdsType;
import io.p071bidmachine.BidMachine;
import io.p071bidmachine.BidMachineAd;
import io.p071bidmachine.CreativeFormat;
import io.p071bidmachine.FullScreenAd;
import io.p071bidmachine.ImageData;
import io.p071bidmachine.MediaAssetType;
import io.p071bidmachine.nativead.view.VideoPlayerActivity;
import io.p071bidmachine.protobuf.RequestExtension;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.λ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C0520 extends AbstractC0535 {

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static final String f1256 = StringFog.decrypt("cMyHY705JXB20LJDuQ==\n", "F6nzJ9RKVRw=\n");

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static final String f1255 = StringFog.decrypt("cdx/j7V8xTFX3WY=\n", "FrkL2dwYoF4=\n");

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static final String f1254 = StringFog.decrypt("UGAEcJzfixJeaw==\n", "NwVwMfiw5nM=\n");

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static final String f1253 = StringFog.decrypt("F+gqCyjoKtIZ+zsBPg==\n", "cI1eSFqNS6Y=\n");

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    public static final String f1252 = StringFog.decrypt("yyXHUhKej4fJ\n", "rECzEGfw6+s=\n");

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    public static final String f1251 = StringFog.decrypt("0rCihdieg0PUrA==\n", "tdXWwbHt8y8=\n");

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    public static final String f1250 = StringFog.decrypt("1dD8kGCLKefTzMq1Z5Y8+Q==\n", "srWI1An4WYs=\n");

    /* JADX INFO: renamed from: ヮ, reason: contains not printable characters */
    public static final String f1249 = StringFog.decrypt("KFL+2zG5X2c9cvLtAKVediB74+ok\n", "TzeKmVDXMQI=\n");

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    public static final String f1248 = StringFog.decrypt("nr0BjpeyUXI=\n", "+dh12P7WNB0=\n");

    /* JADX INFO: renamed from: ト, reason: contains not printable characters */
    public static final String f1247 = StringFog.decrypt("tAj0cnfp8Iu8Ge97Zu7U\n", "022ANw+doPk=\n");

    /* JADX INFO: renamed from: ゥ, reason: contains not printable characters */
    public static final String f1246 = StringFog.decrypt("Lcg9JmJffO0+3yAKfA==\n", "Sq1JZBsrGb4=\n");

    /* JADX INFO: renamed from: へ, reason: contains not printable characters */
    public static final String f1245 = StringFog.decrypt("1d7BWGvWqUrZwOFSa9apStnA\n", "t6e1PTii2yM=\n");

    /* JADX INFO: renamed from: っ, reason: contains not printable characters */
    public static final String f1244 = StringFog.decrypt("GQTkdKTKuGUTBP5Qgc8=\n", "fmGQJMir2wA=\n");

    /* JADX INFO: renamed from: く, reason: contains not printable characters */
    public static final String f1243 = StringFog.decrypt("PIxDRFqkIts+\n", "W+k3BT7wW6s=\n");

    /* JADX INFO: renamed from: Ↄ, reason: contains not printable characters */
    public static final String f1242 = StringFog.decrypt("ISjxYosi2gw0BOE=\n", "Rk2FMe5Otmk=\n");

    /* JADX INFO: renamed from: Ⅽ, reason: contains not printable characters */
    public static final String f1241 = StringFog.decrypt("vGDBHxEObaK8cdwiFhtknKZ2wTMRH3o=\n", "zwW1Vn96CNA=\n");

    /* JADX INFO: renamed from: K, reason: contains not printable characters */
    public static final String f1240 = StringFog.decrypt("ZTeUMMmW4CpyN4QuxZL1PXg3kg==\n", "FlLgYqzhgVg=\n");

    /* JADX INFO: renamed from: Ύ, reason: contains not printable characters */
    public static final String f1239 = StringFog.decrypt("GYDtdscW1u4YqfBH0h3W7hg=\n", "auWZNKZ4uIs=\n");

    /* JADX INFO: renamed from: Ὺ, reason: contains not printable characters */
    public static final String f1238 = StringFog.decrypt("kCDRBAW07o+lEOsbDg==\n", "0USSa2vAi+E=\n");

    /* JADX INFO: renamed from: Ῡ, reason: contains not printable characters */
    public static final String f1237 = StringFog.decrypt("D98hMy9KURo3\n", "TrtlWlw6PXs=\n");

    /* JADX INFO: renamed from: Ῠ, reason: contains not printable characters */
    public static final String f1236 = StringFog.decrypt("v8RrLC292g==\n", "/qA9RUnYtb0=\n");

    /* JADX INFO: renamed from: Ὑ, reason: contains not printable characters */
    public static final String f1235 = StringFog.decrypt("vomxBQVVg/yNiJIeJVCj65qDkgI=\n", "/+33cGk50J8=\n");

    /* JADX INFO: renamed from: Ṿ, reason: contains not printable characters */
    public static final String f1234 = StringFog.decrypt("K3uY4buOhzgPbQ==\n", "ah/UiMj64lY=\n");

    /* JADX INFO: renamed from: Ḽ, reason: contains not printable characters */
    public static final String f1233 = StringFog.decrypt("PErzdaSlzrcJ\n", "fS6hENXQq8Q=\n");

    /* JADX INFO: renamed from: Ḹ, reason: contains not printable characters */
    public static final String f1232 = StringFog.decrypt("/kql6FCJ+jPLfpb/QJH6NNpchA==\n", "vy73jSH8n0A=\n");

    /* JADX INFO: renamed from: Ḟ, reason: contains not printable characters */
    public static final String f1231 = StringFog.decrypt("PddnE1OHfw==\n", "fLMURyr3Gqs=\n");

    /* JADX INFO: renamed from: ᵆ, reason: contains not printable characters */
    public static final String f1230 = StringFog.decrypt("D9Talaeu\n", "TrCM/MLZoIA=\n");

    /* JADX INFO: renamed from: ᘥ, reason: contains not printable characters */
    public static final String f1229 = StringFog.decrypt("mke9EoBNZq+rUrYSgE0=\n", "2CbTfOU/KsY=\n");

    /* JADX INFO: renamed from: ᗀ, reason: contains not printable characters */
    public static final String f1228 = StringFog.decrypt("NYBSRjyqnPASlg==\n", "d+E8KFnYypk=\n");

    /* JADX INFO: renamed from: ᖺ, reason: contains not printable characters */
    public static final String f1227 = StringFog.decrypt("u/4wCSo6NzWx+XcFJnA4Nbz/exltHDs6vPRsPSo7LQ==\n", "0pEea0NeWlQ=\n");

    /* JADX INFO: renamed from: ᖸ, reason: contains not printable characters */
    public static final String f1226 = StringFog.decrypt("QKzoFIbu0+NsoA==\n", "AsWMWeeNu4o=\n");

    /* JADX INFO: renamed from: ᖭ, reason: contains not printable characters */
    public static final String f1225 = StringFog.decrypt("7F9VOXDg9LbAU3AQ\n", "rjYxdBGDnN8=\n");

    /* JADX INFO: renamed from: ᖫ, reason: contains not printable characters */
    public static final String f1224 = StringFog.decrypt("xbpGBiloRunAp1EKPHU=\n", "hsgjZ10BMIw=\n");

    /* JADX INFO: renamed from: ᖩ, reason: contains not printable characters */
    public static final String f1223 = StringFog.decrypt("QSFXTKvhpoFp\n", "CEw2K86lx/U=\n");

    /* JADX INFO: renamed from: ᖅ, reason: contains not printable characters */
    public static final String f1222 = StringFog.decrypt("dnt4HIFdMLZLfG0Vsko=\n", "PxUMefMuRN8=\n");

    /* JADX INFO: renamed from: ᕆ, reason: contains not printable characters */
    public static final String f1221 = StringFog.decrypt("Z+tUFNkKYcNa7EEd5xBm3kvrRQM=\n", "LoUgcat5Fao=\n");

    /* JADX INFO: renamed from: ᕄ, reason: contains not printable characters */
    public static final String f1220 = StringFog.decrypt("RIlomW0cJhJnkkWR\n", "AvwE9T5/VHc=\n");

    /* JADX INFO: renamed from: ᕃ, reason: contains not printable characters */
    public static final String f1219 = StringFog.decrypt("Dy+X4+owIa4nPqfz+xQ=\n", "QkrziotxUt0=\n");

    /* JADX INFO: renamed from: ᕂ, reason: contains not printable characters */
    public static final String f1218 = StringFog.decrypt("/Fz1XndU92vG\n", "sTmRNxYCng4=\n");

    /* JADX INFO: renamed from: ᔽ, reason: contains not printable characters */
    public static final String f1217 = StringFog.decrypt("3mZNU6yY3HPUYQpfoNLfc8NgFVSkmJ9k3mwUH4iZ1XvWXwpUsg==\n", "twljMcX8sRI=\n");

    /* JADX INFO: renamed from: ᔺ, reason: contains not printable characters */
    public static final String f1216 = StringFog.decrypt("Fg3H4k8IMx0=\n", "WGyzizltcnk=\n");

    /* JADX INFO: renamed from: ᔹ, reason: contains not printable characters */
    public static final String f1215 = StringFog.decrypt("pxkrRgrGuKGaDDpBGdE=\n", "6XhfL3yj9Mg=\n");

    /* JADX INFO: renamed from: ᔲ, reason: contains not printable characters */
    public static final String f1214 = StringFog.decrypt("ue9MkIfB2DyT51mvmMHi\n", "9444+fGklVk=\n");

    /* JADX INFO: renamed from: ᔱ, reason: contains not printable characters */
    public static final String f1213 = StringFog.decrypt("kurpKf+msLGB6w==\n", "wI+eSI3C1dU=\n");

    /* JADX INFO: renamed from: ᓮ, reason: contains not printable characters */
    public static final String f1212 = StringFog.decrypt("+xaxA4cuouTlGrUWkCSi8g==\n", "qXPGYvVKx4A=\n");

    /* JADX INFO: renamed from: ᐱ, reason: contains not printable characters */
    public static final String f1211 = StringFog.decrypt("CdHM+NHaiG469Mbj6NqCYik=\n", "W7ivkJy/7Ac=\n");

    /* JADX INFO: renamed from: Ꮭ, reason: contains not printable characters */
    public static final String f1210 = StringFog.decrypt("ZgW6Pm+AgsRVOrAzVQ==\n", "NGzZViLl5q0=\n");

    /* JADX INFO: renamed from: Ꮧ, reason: contains not printable characters */
    public static final String f1209 = StringFog.decrypt("pvzdHve1odCs+5oS+/++2Kz7nhn6uK2fnfqQFNO0qNiuxZoZ6Q==\n", "z5PzfJ7RzLE=\n");

    /* JADX INFO: renamed from: პ, reason: contains not printable characters */
    public static final String f1208 = StringFog.decrypt("ksEsmmAiDxm9zTq+bAYKDq3cMQ==\n", "xKhI/w9yY3g=\n");

    /* JADX INFO: renamed from: ე, reason: contains not printable characters */
    public static final String f1207 = StringFog.decrypt("wJONEo7HsIbKlMoego2zht2V1RWGx/ORwJnUXrHKuYLGrM8RnsavpsqIygaO16Q=\n", "qfyjcOej3ec=\n");

    /* JADX INFO: renamed from: ງ, reason: contains not printable characters */
    public static final String f1206 = StringFog.decrypt("KJQTp+MyGtcChQe89SgB/A==\n", "evFi0oZBbpI=\n");

    /* JADX INFO: renamed from: อ, reason: contains not printable characters */
    public static final String f1205 = StringFog.decrypt("s/o=\n", "8p4qYbGFAeg=\n");

    /* JADX INFO: renamed from: ม, reason: contains not printable characters */
    public static final String f1204 = StringFog.decrypt("Ja3Mk95aVRwBqcSOww==\n", "aN+t+robNmg=\n");

    /* JADX INFO: renamed from: น, reason: contains not printable characters */
    public static final String f1203 = StringFog.decrypt("MJNdQdx57ZM8jlUczWD+lH2VUQ2XbO+eOpgeIstg9JsSn0QGz2jphg==\n", "U/wwb7kBnf8=\n");

    /* JADX INFO: renamed from: ต, reason: contains not printable characters */
    public static final String f1202 = StringFog.decrypt("s1DNXhyhzFaSTct2G5HMQZdW1Q==\n", "/iKsN3jlpTc=\n");

    /* JADX INFO: renamed from: ฑ, reason: contains not printable characters */
    public static final String f1201 = StringFog.decrypt("XRRZlIFBT4RRCVHJkFhcgxASVdjKVE2JVx8a95ZYVox6ElXWi15+i0oSQtOQQA==\n", "Pns0uuQ5P+g=\n");

    /* JADX INFO: renamed from: ঢ়, reason: contains not printable characters */
    public static final String f1200 = StringFog.decrypt("QYdivwoifPlph3CiBx977GA=\n", "DPUD1m5rEo0=\n");

    /* JADX INFO: renamed from: ষ, reason: contains not printable characters */
    public static final String f1199 = StringFog.decrypt("KOUcZgLApbMA5Q57D/2ipgnbFHwS7KWiFw==\n", "ZZd9D2aJy8c=\n");

    /* JADX INFO: renamed from: ঘ, reason: contains not printable characters */
    public static final String f1198 = StringFog.decrypt("RpbTJxvzI5Z8\n", "C+SyTn+lSvM=\n");

    /* JADX INFO: renamed from: খ, reason: contains not printable characters */
    public static final String f1197 = StringFog.decrypt("D50cJx5SHbUDgBR6D0sOskKbEGtVRx+4BZZfRAlLBL06mxR+\n", "bPJxCXsqbdk=\n");

    /* JADX INFO: renamed from: এ, reason: contains not printable characters */
    public static final String f1196 = StringFog.decrypt("w2w5Kwk1rff5UjExGQaq9/w=\n", "jh5YQm1jxJI=\n");

    /* JADX INFO: renamed from: ऱ, reason: contains not printable characters */
    public static final String f1195 = StringFog.decrypt("4EhJ/NHq9/HAQE7x\n", "tik6iJCJg5g=\n");

    /* JADX INFO: renamed from: ܟ, reason: contains not printable characters */
    public static final String f1194 = StringFog.decrypt("mGHlpHn3beCUfO35aO5+59Vn6egy+Xz/jyDp6Wjma+WPd6bcffxpzZh64fx1+2Q=\n", "+w6IihyPHYw=\n");

    /* JADX INFO: renamed from: ܘ, reason: contains not printable characters */
    public static final String f1193 = StringFog.decrypt("8zZUmxku/YM=\n", "pVcn709HmPQ=\n");

    /* JADX INFO: renamed from: ے, reason: contains not printable characters */
    public static final String f1192 = StringFog.decrypt("zdiFpjyp/J7BxY37LbDvmYDeiep3p+2B2pmJ6y24+pvazsbeOKL4pMfSnw==\n", "rrfoiFnRjPI=\n");

    /* JADX INFO: renamed from: ۉ, reason: contains not printable characters */
    public static final String f1191 = StringFog.decrypt("1vEFFhqS7gTy5hM=\n", "m4Nkf37TilI=\n");

    /* JADX INFO: renamed from: ۅ, reason: contains not printable characters */
    public static final String f1190 = StringFog.decrypt("VsnliafZ4bda1O3UtsDysBvP6cXszOO6XMKm6rDA+L90wt7Op9Y=\n", "NaaIp8Khkds=\n");

    /* JADX INFO: renamed from: ڑ, reason: contains not printable characters */
    public static final String f1189 = StringFog.decrypt("ox76SEvCyia5FvpIeMXKIw==\n", "9X+JPB2rr1E=\n");

    /* JADX INFO: renamed from: پ, reason: contains not printable characters */
    public static final String f1188 = StringFog.decrypt("3bnBzPMXG7Dokd3J/wEzvfu12cHiHA==\n", "j9yvqJZlct4=\n");

    /* JADX INFO: renamed from: ٽ, reason: contains not printable characters */
    public static final String f1187 = StringFog.decrypt("wRqi4UgAcADLHeXtREp0AMpb4fFADXlP5Qft6kUlfhXBA+X3WA==\n", "qHWMgyFkHWE=\n");

    /* JADX INFO: renamed from: ث, reason: contains not printable characters */
    public static final String f1186 = StringFog.decrypt("lNhd8ePl7xSh61Lm8tblDq/LWuH/\n", "xr0zlYaXhno=\n");

    /* JADX INFO: renamed from: ת, reason: contains not printable characters */
    public static final String f1185 = StringFog.decrypt("lCcBrYbQ36WeIEahiprbpZ9mWa6cwJylnjxGuYbAy+qrKVy7rtfGrYshW7Y=\n", "/Ugvz++0ssQ=\n");

    /* JADX INFO: renamed from: ק, reason: contains not printable characters */
    public static final String f1184 = StringFog.decrypt("8nCDm1nI603HU5iTUOnhUcVwg75Y\n", "oBXt/zy6giM=\n");

    /* JADX INFO: renamed from: פ, reason: contains not printable characters */
    public static final String f1183 = StringFog.decrypt("USjlw4uvswFbL6LPh+WsBVYjrtOLpblOWSPlx5enshNbNa7EjOWYFVQrmMKQrrsOeSM=\n", "OEfLoeLL3mA=\n");

    /* JADX INFO: renamed from: ս, reason: contains not printable characters */
    public static final String f1182 = StringFog.decrypt("crzt4s+aJvpHmOfQw404\n", "INmDhqroT5Q=\n");

    /* JADX INFO: renamed from: ո, reason: contains not printable characters */
    public static final String f1181 = StringFog.decrypt("8b4mHtAOvzD7uWES3ESgNPa1bQ7QBLV/+bUmCtAPpX/ZtV4V3B0=\n", "mNEIfLlq0lE=\n");

    /* JADX INFO: renamed from: յ, reason: contains not printable characters */
    public static final String f1180 = StringFog.decrypt("9doFpgT2fwvYyB+3ItR3GsTOBKY1\n", "t7t2w0eZEns=\n");

    /* JADX INFO: renamed from: Ն, reason: contains not printable characters */
    public static final String f1179 = StringFog.decrypt("vWJeHFgHO2G3ZRkQVE0kZbppFQxYDTEuuWgRDUQRM3L6TxENVCA5baRiAxdFBhtltX4FDFQR\n", "1A1wfjFjVgA=\n");

    /* JADX INFO: renamed from: Ԇ, reason: contains not printable characters */
    public static final String f1178 = StringFog.decrypt("9Al/AmtoFTLSLmYfaFYZJ8QTYBd2\n", "t2YScgQbfEY=\n");

    /* JADX INFO: renamed from: Ӵ, reason: contains not printable characters */
    public static final String f1177 = StringFog.decrypt("m+CWFrhLfvmR59EatAFh/Zzr3Qa4QXS2n+rZB6RddurczNcZoUBg8Ybq8AC8Q179k/zNBrRd\n", "8o+4dNEvE5g=\n");

    /* JADX INFO: renamed from: ӟ, reason: contains not printable characters */
    public static final String f1176 = StringFog.decrypt("8yTjt2VyI//VHeejb24H7tE4+7Vvcw==\n", "sEuOxwoBSos=\n");

    /* JADX INFO: renamed from: Ҭ, reason: contains not printable characters */
    public static final String f1175 = StringFog.decrypt("hRKuAEPq9GaPFekMT6DrYoIZ5RBD4P4pgRjhEV/8/HXCPu8PWuHqbpgY1gtO6/ZKiRzzF1jr6w==\n", "7H2AYiqOmQc=\n");

    /* JADX INFO: renamed from: Ғ, reason: contains not printable characters */
    public static final String f1174 = StringFog.decrypt("0OJXSAYLkhLt5F9W\n", "mJY6JEtu82E=\n");

    /* JADX INFO: renamed from: ѵ, reason: contains not printable characters */
    public static final String f1173 = StringFog.decrypt("nUzq09WbjmKXS63f2dGRZppHocPVkYQtmUalwsmNhnHaa7Dc0LKGYodWttTO\n", "9CPEsbz/4wM=\n");

    /* JADX INFO: renamed from: п, reason: contains not printable characters */
    public static final String f1172 = StringFog.decrypt("KaD+nkokd1E=\n", "ZMWf7T9WEiM=\n");

    /* JADX INFO: renamed from: н, reason: contains not printable characters */
    public static final String f1171 = StringFog.decrypt("HUeJK+Q37JAXQM4n6H3zlBpMwjvkPebfGU3GOvgh5INaZcIo/ibzlAY=\n", "dCinSY1TgfE=\n");

    /* JADX INFO: renamed from: У, reason: contains not printable characters */
    public static final String f1170 = StringFog.decrypt("phSOcS1qUcStEIx2N2pN\n", "63HvAlgYNLY=\n");

    /* JADX INFO: renamed from: С, reason: contains not printable characters */
    public static final String f1169 = StringFog.decrypt("gI0BJs0+jqSKikYqwXSRoIeGSjbNNITrhIdON9EohrfHr0ol1y+RoJukTifQNZG8\n", "6eIvRKRa48U=\n");

    /* JADX INFO: renamed from: Ϲ, reason: contains not printable characters */
    public static final String f1168 = StringFog.decrypt("4nsbKKuaRyXHZw0otg==\n", "tBJ/TcTXIkQ=\n");

    /* JADX INFO: renamed from: ϵ, reason: contains not printable characters */
    public static final String f1167 = StringFog.decrypt("/Re/MIa/44L3EPg8ivX8hvoc9CCGtenN+R3wIZqp65G6Lvg2irTDhvUL5CCKqQ==\n", "lHiRUu/bjuM=\n");

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﻛ */
    public final String mo335() {
        try {
            C0679 c0679 = C0891.m648().f2390;
            String strDecrypt = StringFog.decrypt("vcubo6lwuNnIy5vc\n", "45f/+PUUloQ=\n");
            c0679.getClass();
            return C0679.m570((Object) null, BidMachine.class, strDecrypt);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾇ */
    public final HashMap mo337() {
        HashMap map = new HashMap();
        map.put(f1256, new C0596(this));
        map.put(f1255, new C0588(this));
        map.put(f1252, new C0587(this));
        map.put(f1251, new C0586(this));
        map.put(f1250, new C0566(this));
        map.put(f1249, new C0552(this));
        map.put(f1248, new C0532(this));
        map.put(f1254, new C0528(this));
        map.put(f1253, new C0527(this));
        map.put(f1244, new C0667(this));
        map.put(f1243, new C0653(this));
        map.put(f1242, new C0652(this));
        map.put(f1241, new C0636(this));
        map.put(f1240, new C0623(this));
        map.put(f1239, new C0621(this));
        map.put(f1247, new C0614(this));
        map.put(f1246, new C0602(this));
        map.put(f1245, new C0597(this));
        return map;
    }

    public C0520(String str) {
        super(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:221:0x0358  */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0535
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo336(String str) {
        byte b;
        switch (str.hashCode()) {
            case -2127904484:
                if (str.equals(f1211)) {
                    b = 27;
                } else {
                    b = -1;
                }
                break;
            case -2032115546:
                if (str.equals(f1224)) {
                    b = 14;
                } else {
                    b = -1;
                }
                break;
            case -1921270373:
                if (str.equals(f1195)) {
                    b = 42;
                } else {
                    b = -1;
                }
                break;
            case -1798479256:
                if (str.equals(f1194)) {
                    b = 43;
                } else {
                    b = -1;
                }
                break;
            case -1683121555:
                if (str.equals(f1225)) {
                    b = 13;
                } else {
                    b = -1;
                }
                break;
            case -1677429126:
                if (str.equals(f1169)) {
                    b = 69;
                } else {
                    b = -1;
                }
                break;
            case -1628534628:
                if (str.equals(f1198)) {
                    b = 39;
                } else {
                    b = -1;
                }
                break;
            case -1627944928:
                if (str.equals(f1229)) {
                    b = 9;
                } else {
                    b = -1;
                }
                break;
            case -1518365947:
                if (str.equals(f1189)) {
                    b = 48;
                } else {
                    b = -1;
                }
                break;
            case -1507727624:
                if (str.equals(f1217)) {
                    b = 21;
                } else {
                    b = -1;
                }
                break;
            case -1371195010:
                if (str.equals(f1220)) {
                    b = 18;
                } else {
                    b = -1;
                }
                break;
            case -1332354186:
                if (str.equals(f1170)) {
                    b = 68;
                } else {
                    b = -1;
                }
                break;
            case -1250552156:
                if (str.equals(f1183)) {
                    b = 55;
                } else {
                    b = -1;
                }
                break;
            case -1246480821:
                if (str.equals(f1208)) {
                    b = 30;
                } else {
                    b = -1;
                }
                break;
            case -1157679462:
                if (str.equals(f1188)) {
                    b = 50;
                } else {
                    b = -1;
                }
                break;
            case -1146475727:
                if (str.equals(f1193)) {
                    b = 44;
                } else {
                    b = -1;
                }
                break;
            case -1087582685:
                if (str.equals(f1200)) {
                    b = 37;
                } else {
                    b = -1;
                }
                break;
            case -1011229113:
                if (str.equals(f1201)) {
                    b = 36;
                } else {
                    b = -1;
                }
                break;
            case -912168204:
                if (str.equals(f1172)) {
                    b = 66;
                } else {
                    b = -1;
                }
                break;
            case -838844802:
                if (str.equals(f1192)) {
                    b = 45;
                } else {
                    b = -1;
                }
                break;
            case -676339900:
                if (str.equals(f1181)) {
                    b = 57;
                } else {
                    b = -1;
                }
                break;
            case -642689680:
                if (str.equals(f1196)) {
                    b = 41;
                } else {
                    b = -1;
                }
                break;
            case -609786639:
                if (str.equals(f1213)) {
                    b = 25;
                } else {
                    b = -1;
                }
                break;
            case -589219056:
                if (str.equals(f1238)) {
                    b = 0;
                } else {
                    b = -1;
                }
                break;
            case -572702516:
                if (str.equals(f1233)) {
                    b = 5;
                } else {
                    b = -1;
                }
                break;
            case -564835446:
                if (str.equals(f1180)) {
                    b = 58;
                } else {
                    b = -1;
                }
                break;
            case -481485914:
                if (str.equals(f1178)) {
                    b = 60;
                } else {
                    b = -1;
                }
                break;
            case -475472046:
                if (str.equals(f1235)) {
                    b = 3;
                } else {
                    b = -1;
                }
                break;
            case -458321468:
                if (str.equals(f1175)) {
                    b = 63;
                } else {
                    b = -1;
                }
                break;
            case -444726193:
                if (str.equals(f1168)) {
                    b = 70;
                } else {
                    b = -1;
                }
                break;
            case -401031121:
                if (str.equals(f1187)) {
                    b = 51;
                } else {
                    b = -1;
                }
                break;
            case -211807062:
                if (str.equals(f1226)) {
                    b = 12;
                } else {
                    b = -1;
                }
                break;
            case -150492023:
                if (str.equals(f1218)) {
                    b = 20;
                } else {
                    b = -1;
                }
                break;
            case -77796417:
                if (str.equals(f1174)) {
                    b = 64;
                } else {
                    b = -1;
                }
                break;
            case -74198712:
                if (str.equals(f1176)) {
                    b = 62;
                } else {
                    b = -1;
                }
                break;
            case 2115:
                if (str.equals(f1205)) {
                    b = 32;
                } else {
                    b = -1;
                }
                break;
            case 1282165:
                if (str.equals(f1197)) {
                    b = 40;
                } else {
                    b = -1;
                }
                break;
            case 3368703:
                if (str.equals(f1237)) {
                    b = 1;
                } else {
                    b = -1;
                }
                break;
            case 115510158:
                if (str.equals(f1179)) {
                    b = 59;
                } else {
                    b = -1;
                }
                break;
            case 141091039:
                if (str.equals(f1203)) {
                    b = 34;
                } else {
                    b = -1;
                }
                break;
            case 198859690:
                if (str.equals(f1177)) {
                    b = 61;
                } else {
                    b = -1;
                }
                break;
            case 232445755:
                if (str.equals(f1173)) {
                    b = 65;
                } else {
                    b = -1;
                }
                break;
            case 320151695:
                if (str.equals(f1222)) {
                    b = 16;
                } else {
                    b = -1;
                }
                break;
            case 426926836:
                if (str.equals(f1182)) {
                    b = 56;
                } else {
                    b = -1;
                }
                break;
            case 503762424:
                if (str.equals(f1236)) {
                    b = 2;
                } else {
                    b = -1;
                }
                break;
            case 515025176:
                if (str.equals(f1185)) {
                    b = 53;
                } else {
                    b = -1;
                }
                break;
            case 529939434:
                if (str.equals(f1231)) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 582846547:
                if (str.equals(f1167)) {
                    b = 71;
                } else {
                    b = -1;
                }
                break;
            case 625873720:
                if (str.equals(f1190)) {
                    b = 47;
                } else {
                    b = -1;
                }
                break;
            case 713768498:
                if (str.equals(f1214)) {
                    b = 24;
                } else {
                    b = -1;
                }
                break;
            case 737636858:
                if (str.equals(f1207)) {
                    b = 31;
                } else {
                    b = -1;
                }
                break;
            case 742497451:
                if (str.equals(f1209)) {
                    b = 29;
                } else {
                    b = -1;
                }
                break;
            case 745946635:
                if (str.equals(f1215)) {
                    b = 23;
                } else {
                    b = -1;
                }
                break;
            case 961844241:
                if (str.equals(f1228)) {
                    b = 10;
                } else {
                    b = -1;
                }
                break;
            case 1125320581:
                if (str.equals(f1223)) {
                    b = 15;
                } else {
                    b = -1;
                }
                break;
            case 1165508119:
                if (str.equals(f1234)) {
                    b = 4;
                } else {
                    b = -1;
                }
                break;
            case 1182958087:
                if (str.equals(f1186)) {
                    b = 52;
                } else {
                    b = -1;
                }
                break;
            case 1212533506:
                if (str.equals(f1212)) {
                    b = 26;
                } else {
                    b = -1;
                }
                break;
            case 1297340448:
                if (str.equals(f1221)) {
                    b = 17;
                } else {
                    b = -1;
                }
                break;
            case 1387614166:
                if (str.equals(f1232)) {
                    b = 6;
                } else {
                    b = -1;
                }
                break;
            case 1395486086:
                if (str.equals(f1204)) {
                    b = 33;
                } else {
                    b = -1;
                }
                break;
            case 1444286894:
                if (str.equals(f1202)) {
                    b = 35;
                } else {
                    b = -1;
                }
                break;
            case 1461955341:
                if (str.equals(f1210)) {
                    b = 28;
                } else {
                    b = -1;
                }
                break;
            case 1494941328:
                if (str.equals(f1206)) {
                    b = 49;
                } else {
                    b = -1;
                }
                break;
            case 1509454960:
                if (str.equals(f1171)) {
                    b = 67;
                } else {
                    b = -1;
                }
                break;
            case 1733033450:
                if (str.equals(f1184)) {
                    b = 54;
                } else {
                    b = -1;
                }
                break;
            case 1917129446:
                if (str.equals(f1219)) {
                    b = 19;
                } else {
                    b = -1;
                }
                break;
            case 1955913096:
                if (str.equals(f1230)) {
                    b = 8;
                } else {
                    b = -1;
                }
                break;
            case 2034998687:
                if (str.equals(f1191)) {
                    b = 46;
                } else {
                    b = -1;
                }
                break;
            case 2110329530:
                if (str.equals(f1216)) {
                    b = 22;
                } else {
                    b = -1;
                }
                break;
            case 2112955383:
                if (str.equals(f1199)) {
                    b = 38;
                } else {
                    b = -1;
                }
                break;
            case 2136410007:
                if (str.equals(f1227)) {
                    b = 11;
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
                return AdContentType.class;
            case 1:
                return Ad.Display.class;
            case 2:
                return Ad.Video.class;
            case 3:
                return AdFullScreenListener.class;
            case 4:
                return AdListener.class;
            case 5:
                return AdRequest.class;
            case 6:
                return AdRequestParameters.class;
            case 7:
                return AdsType.class;
            case 8:
                return AdView.class;
            case 9:
                return io.p071bidmachine.banner.b.class;
            case 10:
            case 11:
                return io.p071bidmachine.banner.h.class;
            case 12:
                return BidMachine.class;
            case 13:
                return BidMachineAd.class;
            case 14:
                return CreativeFormat.class;
            case 15:
                return ImageData.class;
            case 16:
                return io.p071bidmachine.interstitial.a.class;
            case 17:
                return io.p071bidmachine.interstitial.c.class;
            case 18:
                return FullScreenAd.class;
            case 19:
                return MediaAssetType.class;
            case 20:
            case 21:
                return io.p071bidmachine.nativead.view.d.class;
            case 22:
                return io.p071bidmachine.nativead.c.class;
            case 23:
                return io.p071bidmachine.nativead.j.class;
            case 24:
                return io.p071bidmachine.nativead.view.g.class;
            case 25:
                return io.p071bidmachine.rewarded.a.class;
            case 26:
                return io.p071bidmachine.rewarded.b.class;
            case 27:
                return RichMediaListener.class;
            case 28:
            case 29:
                return RichMediaView.class;
            case 30:
            case 31:
                return VideoPlayerActivity.class;
            case 32:
                return Ad.class;
            case 33:
            case 34:
                return MraidActivity.class;
            case 35:
            case 36:
                return MraidDialogActivity.class;
            case 37:
                return MraidInterstitial.class;
            case 38:
                return MraidInterstitialListener.class;
            case 39:
            case 40:
                return MraidView.class;
            case 41:
                return MraidViewListener.class;
            case 42:
            case 43:
                return VastActivity.class;
            case 44:
            case 45:
                return VastView.class;
            case 46:
            case 47:
                return MraidAdView.class;
            case 48:
                return VastViewListener.class;
            case 49:
                return RequestExtension.class;
            case 50:
            case 51:
                return io.p071bidmachine.iab.mraid.MraidActivity.class;
            case 52:
            case 53:
                return io.p071bidmachine.iab.vast.activity.VastActivity.class;
            case 54:
            case 55:
                return io.p071bidmachine.rendering.ad.fullscreen.f.class;
            case 56:
            case 57:
                return io.p071bidmachine.rendering.ad.view.i.class;
            case 58:
            case 59:
                return io.p071bidmachine.rendering.measurer.a.class;
            case 60:
            case 61:
                return io.p071bidmachine.rendering.measurer.b.class;
            case 62:
            case 63:
                return io.p071bidmachine.rendering.measurer.c.class;
            case 64:
            case 65:
                return io.p071bidmachine.rendering.measurer.d.class;
            case 66:
            case 67:
                return io.p071bidmachine.rendering.measurer.f.class;
            case 68:
            case 69:
                return io.p071bidmachine.ads.networks.adaptiverendering.measurer.a.class;
            case 70:
            case 71:
                return io.p071bidmachine.rendering.measurer.g.class;
            default:
                return null;
        }
    }
}
