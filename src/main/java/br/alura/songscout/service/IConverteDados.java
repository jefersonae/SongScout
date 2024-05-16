package br.alura.songscout.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
