package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    static final androidx.collection.a<String, Integer> f75c;

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f76d = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f77e = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f78f = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: a  reason: collision with root package name */
    final Bundle f79a;

    /* renamed from: b  reason: collision with root package name */
    private MediaMetadata f80b;

    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        f75c = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f79a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f80b = mediaMetadata;
        return createFromParcel;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f79a);
    }
}
