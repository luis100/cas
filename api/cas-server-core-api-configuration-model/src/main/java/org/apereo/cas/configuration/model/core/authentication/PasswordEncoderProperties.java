package org.apereo.cas.configuration.model.core.authentication;

import lombok.extern.slf4j.Slf4j;
import org.apereo.cas.configuration.support.RequiresModule;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * This is {@link PasswordEncoderProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@RequiresModule(name = "cas-server-core-authentication", automated = true)
@Slf4j
@Getter
@Setter
public class PasswordEncoderProperties implements Serializable {

    private static final long serialVersionUID = -2396781005262069816L;

    public enum PasswordEncoderTypes {

        /**
         * No password encoding will take place.
         */
        NONE, /**
         * Uses an encoding algorithm and a char encoding algorithm.
         */
        DEFAULT, /**
         * Uses {@link org.springframework.security.crypto.password.StandardPasswordEncoder}.
         * A standard {@code PasswordEncoder} implementation that uses SHA-256 hashing with 1024
         * iterations and a random 8-byte random salt value.
         */
        STANDARD, /**
         * Uses {@link org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder}.
         */
        BCRYPT, /**
         * Uses {@link org.springframework.security.crypto.scrypt.SCryptPasswordEncoder}.
         */
        SCRYPT, /**
         * Uses {@link org.springframework.security.crypto.password.Pbkdf2PasswordEncoder}.
         */
        PBKDF2
    }

    /**
     * Define the password encoder type to use.
     * Type may be specified as blank or 'NONE' to disable password encoding.
     * It may also refer to a fully-qualified class name that implements
     * the {@link org.springframework.security.crypto.password.PasswordEncoder} interface
     * if you wish you define your own encoder.
     * @see PasswordEncoderTypes
     */
    private String type = "NONE";

    /**
     * The encoding algorithm to use such as 'MD5'.
     * Relevant when the type used is 'DEFAULT'.
     */
    private String encodingAlgorithm;

    /**
     * The encoding algorithm to use such as 'UTF-8'.
     * Relevant when the type used is 'DEFAULT'.
     */
    private String characterEncoding;

    /**
     * Secret to use with STANDARD, PBKDF2, BCRYPT password encoders.
     * Secret usually is an optional setting.
     */
    private String secret;

    /**
     * Strength or number of iterations to use for password hashing.
     * Usually relevant when dealing with PBKDF2 or BCRYPT encoders.
     */
    private int strength = 16;
}
