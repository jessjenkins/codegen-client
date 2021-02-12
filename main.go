package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
	"time"
)

type Message struct {
	Msg string `json:"msg"`
}

func main() {
	fmt.Println("Simple go server")
	http.HandleFunc("/hello", helloHandler)
	log.Fatal(http.ListenAndServe("localhost:8080", nil))
}

func helloHandler(w http.ResponseWriter, r *http.Request) {
	log.Printf("%s:%s", time.Now().Format(time.RFC3339), "Hello")
	msg := Message{"Hello, World"}
	data, _ := json.Marshal(msg)
	w.Header().Add("Content-Type", "application/json")
	w.Write(data)
}
