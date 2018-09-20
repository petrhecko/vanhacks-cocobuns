--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.6
-- Dumped by pg_dump version 10.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: message; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE message (
    id bigint NOT NULL,
    message character varying(2044) NOT NULL
);


ALTER TABLE message OWNER TO postgres;

--
-- Name: message_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE message_seq
    START WITH 0
    INCREMENT BY 1
    MINVALUE 0
    MAXVALUE 99999999
    CACHE 10;


ALTER TABLE message_seq OWNER TO postgres;

--
-- Name: message message_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY message
    ADD CONSTRAINT message_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

