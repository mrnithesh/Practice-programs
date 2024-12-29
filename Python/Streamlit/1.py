import streamlit as st

if "chat_history" not in st.session_state:
    st.session_state.chat_history=[]

st.title("Test chat app")
sal = st.selectbox("Select your salutation",["Mr","Mrs","Miss"])
name = st.text_input("Enter your name :")
if st.button("ok"):
    st.write(f"Hello {sal} {name}")
if st.button("start the chat"):
    st.write("Chat started")
user_input = st.text_input("Enter your message",key="user_input")
if st.button("Send"):
    st.session_state.chat_history.append(f"You :{user_input}")
    st.session_state.chat_history.append(f"Bot :{user_input}")
for message in st.session_state.chat_history:
        st.write(message)


