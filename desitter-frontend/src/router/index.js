import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
import Main from '../views/Main.vue'
import EditUser from '../views/EditUser.vue'
import PostArticle from '../views/PostArticle.vue'
import EditArticle from '../views/EditArticle.vue'
import Contact from '../views/Contact.vue'
import SignupUser from '../views/SignupUser.vue'

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  },
  {
    path: '/main',
    name: 'Main',
    component: Main
  },
  {
    path: '/editusr',
    name: 'EditUser',
    component: EditUser
  },
  {
    path: '/postart',
    name: 'PostArticle',
    component: PostArticle
  },
  {
    path: '/editart',
    name: 'EditArticle',
    component: EditArticle
  },
  {
    path: '/contact',
    name: 'Contact',
    component: Contact
  },
  {
    path: '/newusr',
    name: 'SignupUser',
    component: SignupUser
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
