package androidx.media3.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.XmlPullParserUtil;
import defpackage.d31;
import defpackage.n30;
import defpackage.y21;
import defpackage.y32;
import defpackage.z21;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class XmpMotionPhotoDescriptionParser {
    private static final String TAG = "MotionPhotoXmpParser";
    private static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private static d31 parseMicroVideoOffsetFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return d31.F(new MotionPhotoDescription.ContainerItem("image/jpeg", "Primary", 0L, 0L), new MotionPhotoDescription.ContainerItem("video/mp4", "MotionPhoto", Long.parseLong(attributeValue), 0L));
            }
        }
        z21 z21Var = d31.b;
        return y32.e;
    }

    private static boolean parseMotionPhotoFlagFromDescription(XmlPullParser xmlPullParser) {
        for (String str : MOTION_PHOTO_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                return Integer.parseInt(attributeValue) == 1;
            }
        }
        return false;
    }

    private static long parseMotionPhotoPresentationTimestampUsFromDescription(XmlPullParser xmlPullParser) {
        for (String str : DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES) {
            String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, str);
            if (attributeValue != null) {
                long j = Long.parseLong(attributeValue);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    private XmpMotionPhotoDescriptionParser() {
    }

    @Nullable
    public static MotionPhotoDescription parse(String str) throws IOException {
        try {
            return parseInternal(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            Log.w(TAG, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    private static MotionPhotoDescription parseInternal(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "x:xmpmeta")) {
            z21 z21Var = d31.b;
            d31 motionPhotoV1Directory = y32.e;
            long motionPhotoPresentationTimestampUsFromDescription = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "rdf:Description")) {
                    if (parseMotionPhotoFlagFromDescription(xmlPullParserNewPullParser)) {
                        motionPhotoPresentationTimestampUsFromDescription = parseMotionPhotoPresentationTimestampUsFromDescription(xmlPullParserNewPullParser);
                        motionPhotoV1Directory = parseMicroVideoOffsetFromDescription(xmlPullParserNewPullParser);
                    }
                    return null;
                }
                if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "Container:Directory")) {
                    motionPhotoV1Directory = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "Container", "Item");
                } else if (XmlPullParserUtil.isStartTag(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    motionPhotoV1Directory = parseMotionPhotoV1Directory(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (!motionPhotoV1Directory.isEmpty()) {
                return new MotionPhotoDescription(motionPhotoPresentationTimestampUsFromDescription, motionPhotoV1Directory);
            }
            return null;
        }
        throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
    }

    private static d31 parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        y21 y21VarX = d31.x();
        String strM = n30.m(str, ":Item");
        String strM2 = n30.m(str, ":Directory");
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, strM)) {
                String strM3 = n30.m(str2, ":Mime");
                String strM4 = n30.m(str2, ":Semantic");
                String strM5 = n30.m(str2, ":Length");
                String strM6 = n30.m(str2, ":Padding");
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, strM3);
                String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strM4);
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strM5);
                String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, strM6);
                if (attributeValue != null && attributeValue2 != null) {
                    long j2 = 0;
                    if (attributeValue3 != null) {
                        j = Long.parseLong(attributeValue3);
                    } else {
                        j = 0;
                    }
                    if (attributeValue4 != null) {
                        j2 = Long.parseLong(attributeValue4);
                    }
                    y21VarX.a(new MotionPhotoDescription.ContainerItem(attributeValue, attributeValue2, j, j2));
                } else {
                    return y32.e;
                }
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, strM2));
        return y21VarX.g();
    }
}
