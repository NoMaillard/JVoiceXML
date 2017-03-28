/*
 * JVoiceXML - A free VoiceXML implementation.
 *
 * Copyright (C) 2017 JVoiceXML group - http://jvoicexml.sourceforge.net
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public
 * License as published by the Free Software Foundation; either
 * version 2 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
package org.jvoicexml.implementation;

import java.io.OutputStream;

import javax.sound.sampled.AudioFormat;

/**
 * An audio source delivers audio data via an {@link OutputStream}.
 * @author Dirk Schnelle-Walka
 * @since 0.7.8
 */
public interface AudioSource {
    /**
     * Retrieves the audio format that this source is delivering.
     * @return employed audio format.
     */
    AudioFormat getAudioFormat();

    /**
     * Retrieves the stream to read audio data.
     * @return audio data stream
     */
    OutputStream getOutputStream();
}
